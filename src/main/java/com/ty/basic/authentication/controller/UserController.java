package com.ty.basic.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.basic.authentication.dto.User;
import com.ty.basic.authentication.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping()
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
}
