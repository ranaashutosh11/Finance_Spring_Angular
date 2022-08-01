package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.beans.Product;
import com.lti.beans.User;
import com.lti.services.AdminService;
import com.lti.services.ProductService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/adminRest/api")
public class AdminController {

	@Autowired
	AdminService adminloginservice;
	

// 		http://localhost:8686/adminRest/api/validate/101/Abhishek/Qwerty123
	@GetMapping("/validate/{adminId}/{adminName}/{adminPassword}")
	public int validateAdmin(@PathVariable(value = "adminId") long adminId,
			@PathVariable(value = "adminName") String adminName,
			@PathVariable(value = "adminPassword") String adminPassword) {

		List<Admin> a = adminloginservice.getByAdminId(adminId);

		if (a.get(0).getAdminId() != adminId) {
			return 2;
		} else if (a.get(0).getAdminName().equals(adminName) && a.get(0).getAdminPassword().equals(adminPassword)) {
			return 1;
		}		
		else
			return 3;
		}

//		http://localhost:8686/adminRest/api/userDetails
	@GetMapping("/userDetails")
	public List<User> getAllUserdetails() {
		return adminloginservice.getUserdetails();
	}

//		http://localhost:8686/adminRest/api/userDetails/{userId}
	@GetMapping("/userDetails/{userId}")
	public List<User> findUserDetailsById(@PathVariable(value = "userId") int userId) {
		List<User> result = adminloginservice.findUser(userId);
		return result;
	}

//	http://localhost:8686/adminRest/api/userDetails/delete/{userId}
	@DeleteMapping("/userDetails/delete/{userId}")
	public String deleteUser(@PathVariable(value = "userId") int userId) {
		adminloginservice.deleteUser(userId);
		return "User Id " + userId + " deleted";
	}

	// http://localhost:8686/adminRest/api/addproduct
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Product product) {
		
		return adminloginservice.addProduct(product);
	}

	// http://localhost:8686/adminRest/api/deleteProduct/{prdId}
	@DeleteMapping("/deleteProduct/{prdId}")
	public String deleteProduct(@PathVariable(value = "prdId") int prdId) {
		adminloginservice.deleteProduct(prdId);
		return "Product Id " + prdId + " deleted";
	}

	
	//http://localhost:8686/adminRest/api/updateCardStatus/401
	@PutMapping("/updateCardStatus/{userId}")
	public String updateCardStatus(@PathVariable(value="userId") int userId) {
		adminloginservice.updateCardStatus(userId);
		return "UserId "+userId+" is verified";
	}
//	

}