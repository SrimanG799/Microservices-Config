package com.ciq.webclientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;

import com.ciq.entity.DepartmentDto;
import com.ciq.entity.ResponseDto;
import com.ciq.entity.User;
import com.ciq.entity.UserDto;
import com.ciq.repository.UserRepository;

import lombok.AllArgsConstructor;




@AllArgsConstructor

@Service

public class WebUserServiceImpli implements WebUserService {
	private UserRepository userRepository;

	private WebClient webClient;
	
	

	@Override
	public User saveuser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user) ;
	}

	@Override
	public ResponseDto getUser(Long userId) {
		
		
		  ResponseDto responseDto = new ResponseDto();
	        User user = userRepository.findById(userId).get();
	        UserDto userDto = mapToUser(user);
	        System.out.println(user);

	        DepartmentDto departmentDto = webClient.get()
	                 .uri("http://localhost:59305/getDepartmentId/" +user.getDepartmentid() )
	                         .retrieve()
	                                 .bodyToMono(DepartmentDto.class)
	                                         .block();
	        responseDto.setUser(userDto);
	        responseDto.setDepartment(departmentDto);
      System.out.println(responseDto);
	        return responseDto;
	
	}

	private UserDto mapToUser(User user) {
		// TODO Auto-generated method stub
		UserDto userDto=new UserDto();
		userDto.setDepartmentid(user.getDepartmentid());
		userDto.setId(user.getId());
		userDto.setFirstname(user.getFirstname());
		userDto.setLastname(user.getLastname());
		userDto.setEmail(user.getEmail());
		
		
		
		return userDto;
	}

}
