package com.service;

import java.util.Map;

import com.bean.User;
import com.repository.UserRepository;

public class UserService {

	public User addUser(Map<String, String[]> parameters) {
		User user = new User();
		user.setName(parameters.get("name")[0]);
		user.setPassword(parameters.get("password")[0]);
		
		UserRepository ur = new UserRepository();
		int id = ur.insert(user);
		
		user.setId(id);
		
		return user;
	}

}
