package com.ty.basic.authentication.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.basic.authentication.dto.User;
import com.ty.basic.authentication.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User getUser(int id) {
		Optional<User> opt = userRepository.findById(id);
		return opt != null ? opt.get() : null;
	}

	public User findUserByUsername(String username) {
		return userRepository.findUserByUsername(username);
	}
}
