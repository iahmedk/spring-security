package com.ty.basic.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ty.basic.authentication.dao.UserDao;
import com.ty.basic.authentication.dto.User;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findUserByUsername(username);
		if (user != null) {
			return  new CustomUserDetails(user);
		} else {
			throw new UsernameNotFoundException("Username did not found !!");
		}
	}
}
