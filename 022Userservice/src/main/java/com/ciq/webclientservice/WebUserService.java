package com.ciq.webclientservice;

import com.ciq.entity.ResponseDto;
import com.ciq.entity.User;

public interface WebUserService {
      User saveuser(User user);
	
	 ResponseDto getUser(Long userId);

}
