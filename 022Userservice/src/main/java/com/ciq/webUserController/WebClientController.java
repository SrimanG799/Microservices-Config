package com.ciq.webUserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.ResponseDto;
import com.ciq.webclientservice.WebUserService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class WebClientController {
	@Autowired
	private WebUserService webUserService;
	
	
	@GetMapping("/getById/{id}")
	public  ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId)
	{
		log.info(" WebClientController*******");
	
		ResponseDto responseDto=webUserService.getUser(userId);
		System.out.println(responseDto);
		return  ResponseEntity.ok(responseDto);
		
	}

}
