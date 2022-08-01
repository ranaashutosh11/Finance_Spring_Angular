package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.User;
import com.lti.dao.UserDao;
import com.lti.userexception.UserException;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao dao;

	@Override
	public int addUser(User user) {
		return dao.addUser(user);
	}
	
	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public int updatebyPhone(int userId, long newPhoneno) {
		return dao.updatebyPhone(userId, newPhoneno);
	}

	@Override
	public List<User> findUserbyName(String name) {
		return dao.findUserbyName(name);
	}

	@Override
	public boolean Validate(int userId, String userName, String userPass) throws UserException{
		return dao.Validate(userId, userName, userPass);
	}

	

}
