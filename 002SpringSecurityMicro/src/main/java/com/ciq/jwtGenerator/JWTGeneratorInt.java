package com.ciq.jwtGenerator;

import java.util.Map;

import com.ciq.entity.User;

public interface JWTGeneratorInt {
	Map<String,String> tokenGenerate(User user);

}
