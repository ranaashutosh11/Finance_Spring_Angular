package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Admin;
import com.lti.beans.Product;
import com.lti.beans.User;
import com.lti.dao.AdminDao;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;

	@Override
	public List<Admin> getByAdminId(long adminId) {
		System.out.println("service layer called");
		return dao.getByAdminId(adminId);
	}

	@Override
	public List<User> getUserdetails() {
		return dao.getUserdetails();
	}

	@Override
	public List<User> findUser(int userId) {
		System.out.println("service layer called");
		return dao.findUser(userId);
	}

	@Override
	public boolean deleteUser(int userId) {
		dao.deleteUser(userId);
		return true;
	}

	@Override
	public String addProduct(Product product) {
		return dao.addProduct(product);

	}

	@Override
	public boolean deleteProduct(int prdId) {
		dao.deleteProduct(prdId);
		return true;
	}

	@Override
	public String updateCardStatus(int userId) {
		dao.updateCardStatus(userId);
		return "verified";
	}


//	

}