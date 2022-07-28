package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.User;
import com.lti.dao.UserDao;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao dao;
	
	@Override
	public int addUser(User user) {
		return dao.addUser(user);
	}

}
