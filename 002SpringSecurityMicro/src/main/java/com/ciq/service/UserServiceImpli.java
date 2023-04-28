package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.User;
import com.ciq.repository.UserRepository;
@Service
public class UserServiceImpli implements UserService{
	@Autowired
 private UserRepository userRepository;
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	@Override
	public User getUserByNameAndPassword(String uname, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		User user=userRepository.findByUnameAndPassword(uname, password);
	if(user==null)
	{
		throw new UserNotFoundException("user not found");
	}
		return user;
	}

}
