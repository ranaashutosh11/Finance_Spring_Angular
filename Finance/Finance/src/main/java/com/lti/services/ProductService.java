package com.lti.services;

import java.util.List;

import com.lti.beans.Product;

public interface ProductService {
	public List<Product> getPrdList();
	public List<Product> getPrdByName(String pName);

}