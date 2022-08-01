package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Product;
import com.lti.services.ProductService;



@CrossOrigin("*")
@RestController
@RequestMapping("/prd-api")
public class ProductController {
    
	@Autowired
	ProductService service;
	
	// http://localhost:8686/prd-api/prdlist
	@GetMapping("/prdlist")
	public List<Product> getPrdList() {
		List<Product> prdList=service.getPrdList();
		return prdList;
	}
	
	// http://localhost:8686/prd-api/prdlistbyname/mercedes
	@GetMapping("/prdlistbyname/{pname}")
	public List<Product> getPrdByName(@PathVariable("pname") String pName){
		List<Product> prdList=service.getPrdByName(pName);
		return prdList;
	}
}