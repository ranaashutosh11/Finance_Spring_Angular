package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.User;
import com.lti.services.UserServices;

@RestController
@RequestMapping("/user-api")
public class UserController {

	@Autowired
	UserServices services;
	
	//  http://localhost:8070/user-api/adduser
	
	@PostMapping("/adduser")
	public int addUser(@RequestBody User user) {
		int userId=services.addUser(user);
		return userId;
	}
}
