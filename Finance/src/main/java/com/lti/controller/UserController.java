package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.User;
import com.lti.services.UserServices;
import com.lti.userexception.UserException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user-api")
public class UserController {

	@Autowired
	UserServices services;

//	{
//		   "userId":102,
//		   "userName":"Rahul",
//		   "userPhone":78548965,
//		   "userEmail":"def@gmail.com",
//		   "userPass":"ghft@",
//		   "userConfirmPass":"ghft@",
//		   "userAdd":"Mumbai",
//		   "userSalary":60000,
//		   "userCard":"Platinum"
//		}

	// URL for adding a new User
	// http://localhost:8060/user-api/adduser

	@PostMapping("/adduser")
	public int addUser(@RequestBody User user) {
		int userId = services.addUser(user);
		return userId;
	}

	// http://localhost:8060/user-api/getalluser

	@GetMapping("/getalluser")
	public List<User> getAllUser() {
		List<User> myList = services.getAllUsers();
		return myList;
	}

	// URL for finding a user by name
	// http://localhost:8060/user-api/finduserbyname/Ashutosh

	@GetMapping("/finduserbyname/{name}")
	public List<User> findUserbyName(@PathVariable("name") String userName) {
		List<User> myList = services.findUserbyName(userName);
		return myList;
	}

	// URL for updating a user's Phone number
	// http://localhost:8060/user-api/updatebyPhone/101/8240434693

	@PutMapping("/updatebyPhone/{userId}/{newPhoneno}")
	public String updatebyPhone(@PathVariable("userId") int userId, @PathVariable("newPhoneno") long newPhoneno) {
		int id = services.updatebyPhone(userId, newPhoneno);
		return "Phone number for " + id + " updated";

	}

	// URL for validating a user
	// http://localhost:8060/user-api/validate/101/Ashutosh/abcd@

	@GetMapping("/validate/{userId}/{userName}/{userPass}")
	public boolean validate(@PathVariable("userId") int userId, @PathVariable("userName") String userName,
			@PathVariable("userPass") String userPass) throws UserException {
		try {
			boolean res = services.Validate(userId, userName, userPass);
			return res;
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
