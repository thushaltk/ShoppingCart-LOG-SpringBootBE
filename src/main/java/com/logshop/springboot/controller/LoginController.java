package com.logshop.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class LoginController {
	
	@GetMapping("/googleLogin")
	public String googleLogin() {
		return "Login Successfull";
	}
	

}
