package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.User;
import com.ciq.jwtGenerator.JWTGeneratorInt;
import com.ciq.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private JWTGeneratorInt jwtGeneratorInt;

	@PostMapping("/register")
	public ResponseEntity<?> addUser(@RequestBody User user) {

		try {
			userService.saveUser(user);
			return new ResponseEntity<>(user, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception

			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}

	}

	@PostMapping("/login")
	public ResponseEntity<?> LoginUser(@RequestBody User user)

	{

		try {

			if (user.getUname() == null || user.getPassword() == null) {
				throw new DetailsCheckException("user name or password is empty");

			}
			User userData = userService.getUserByNameAndPassword(user.getUname(), user.getPassword());
			if (userData == null) {
				throw new DetailsCheckException("missmatch uname or passsword");
			}
			return new ResponseEntity<>(jwtGeneratorInt.tokenGenerate(user), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);// TODO: handle exception
		}

	}

}
