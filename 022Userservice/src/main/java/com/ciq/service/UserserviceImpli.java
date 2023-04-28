package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ciq.entity.DepartmentDto;
import com.ciq.entity.ResponseDto;
import com.ciq.entity.User;
import com.ciq.entity.UserDto;
import com.ciq.openFeignService.APIClient;
import com.ciq.repository.UserRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserserviceImpli implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
//	private RestTemplate restTemplate;
	APIClient aPIClient;
	
//if we using apiclient no need restTemplete vise versa
	@Override
	public User saveuser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
	
	
	

	@Override
	public ResponseDto getUser(Long userId) {
		// TODO Auto-generated method stub
		
		ResponseDto responseDto=new ResponseDto();
		User user=userRepository.findById(userId).get();
		UserDto userDto=mapToUser(user);
		
//		ResponseEntity<DepartmentDto> responseEntity=restTemplate
//		.getForEntity("http://departmentservice/getDepartmentId/"+user.getDepartmentid(), DepartmentDto.class);
//		
//		DepartmentDto departmentDto=responseEntity.getBody();
//		System.out.println(responseEntity.getStatusCode());
		
		
		
		DepartmentDto departmentDto=aPIClient.getDepart(user.getDepartmentid());
		//if we using api client no need rest templete vise versa

		responseDto.setUser(userDto);
		responseDto.setDepartment(departmentDto);
		
		
		return responseDto;
	}

	private UserDto mapToUser(User user) {
		// TODO Auto-generated method stub
		
		UserDto userdto=new UserDto();
		userdto.setId(user.getId());
		userdto.setDepartmentid(user.getDepartmentid());
		userdto.setFirstname(user.getFirstname());
		userdto.setLastname(user.getLastname());
		userdto.setEmail(user.getEmail());
		return userdto;
	}

}
