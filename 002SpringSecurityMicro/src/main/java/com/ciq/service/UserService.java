package com.ciq.service;

import com.ciq.entity.User;

public interface UserService {
	public void saveUser(User user);
	
	public User getUserByNameAndPassword(String uname,String password) throws UserNotFoundException;

}
