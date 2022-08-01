package com.lti.services;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.Product;
import com.lti.beans.User;

public interface AdminService {

	public List<Admin> getByAdminId(long adminId);

	public List<User> getUserdetails();

	public List<User> findUser(int userId);

	public boolean deleteUser(int userId);

	public String addProduct(Product product);

	public boolean deleteProduct(int prdId);

	public String updateCardStatus(int userId);



}
