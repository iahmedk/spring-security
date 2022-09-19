package com.ty.basic.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to TY";
	}

	@GetMapping("/jspiders")
	public String jspiders() {
		return "Welcome to Jspiders";
	}

	@GetMapping("/qspiders")
	public String qspiders() {
		return "Welcome to Qspiders";
	}
}
