package com.ciq.jwtGenerator;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ciq.entity.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JWTGenerarorIMPLI implements JWTGeneratorInt{
	
	
	 @Value("${jwt.secret}")
	private String secrate;
	 
	 @Value("${app.jwttoken.message}")
	private String message;

	@Override
	public Map<String, String> tokenGenerate(User user) {
		// TODO Auto-generated method stub
		
		String jwtToken=" ";
		jwtToken=Jwts.builder().setSubject(user.getUname()).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256,"secrate").compact();
		
		Map<String, String> tokengenereted=new HashMap<>();
		
		tokengenereted.put("token", jwtToken);
		tokengenereted.put("message", message);
		
		return tokengenereted;
	}

}
