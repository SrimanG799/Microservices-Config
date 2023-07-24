package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.ResponseDto;
import com.ciq.entity.User;
import com.ciq.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RestController
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> saveuser(@RequestBody User user){
		
		User savedUser=userService.saveuser(user);
		return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
		
	}
	
@CircuitBreaker(name = "UserId",fallbackMethod ="getWithId")
@GetMapping("/userById/{id}")
public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId)

{
	log.info("before debug****************************************************",userId);
	ResponseDto responseDto=userService.getUser(userId);
	log.debug("aftyer");
	return ResponseEntity.ok(responseDto);
	
	
}
 public ResponseEntity<ResponseDto> getWithId(Exception e)
 {
	return new ResponseEntity("serverIsDown", HttpStatus.BAD_GATEWAY);
	 
 }
 public void getDetails()
 {
	 System.out.print("hello");
 }


}
