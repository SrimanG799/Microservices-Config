package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.DepartMent;
import com.ciq.service.Departmentservice;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class DepartmentController {
	
	@Autowired
	private Departmentservice departmentservice;
	
	@PostMapping("/addDepartment")
	public ResponseEntity<DepartMent> saveDepartment(@RequestBody DepartMent departMent){
		log.debug("message");
		DepartMent saveDepartMent=departmentservice.saveDepartment(departMent);
		log.debug("after");
		return new ResponseEntity<>(saveDepartMent,HttpStatus.CREATED);
		
	}

	
	@GetMapping("/getDepartmentId/{id}")
	public ResponseEntity<DepartMent> getDep(@PathVariable("id") Long id){
		
		DepartMent departMent=departmentservice.getDepartMentByid(id);
		System.out.println(departMent);
		System.out.print("Hello");
		return ResponseEntity.ok(departMent);
		
	}
	@GetMapping("/getMeld")
public  void getDetails()
{
		System.out.println("hello");
}
public void getHello()
{
	 System.out.println("hello welcomr0");
}
	
	
}
