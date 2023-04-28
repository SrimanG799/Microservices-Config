package com.ciq.block;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {
	
	@GetMapping("/unrestricted")
	public ResponseEntity<?> getMessage()
	{
		return new ResponseEntity<>("hai this is normal message",HttpStatus.OK);
		
	}
	@GetMapping("/restricted")
	public ResponseEntity<?> getResrtictedMessage()
	{
		return new ResponseEntity<>("this is restricted message",HttpStatus.OK);
	}

}
