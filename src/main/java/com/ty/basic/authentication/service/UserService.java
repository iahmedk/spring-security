package com.ty.basic.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ty.basic.authentication.dao.UserDao;
import com.ty.basic.authentication.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public User saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userDao.saveUser(user);
	}

	public User getUser(int id) {
		return userDao.getUser(id);
	}
}
