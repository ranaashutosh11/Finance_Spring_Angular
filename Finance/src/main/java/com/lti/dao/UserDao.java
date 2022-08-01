package com.lti.dao;

import java.util.List;

import com.lti.beans.User;
import com.lti.userexception.UserException;

public interface UserDao {

	public int addUser(User user);
	
	public List<User> getAllUsers();

	public List<User> findUserbyName(String name);

	public int updatebyPhone(int userId, long newPhoneno);

	public boolean Validate(int userId, String userName, String userPass) throws UserException;

}
