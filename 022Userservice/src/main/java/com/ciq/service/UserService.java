package com.ciq.service;

import com.ciq.entity.ResponseDto;
import com.ciq.entity.User;

public interface UserService {
	
	User saveuser(User user);
	
	ResponseDto getUser(Long userId);

}
