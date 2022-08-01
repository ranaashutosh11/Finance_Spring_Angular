package com.lti.services;

import java.util.List;

import com.lti.beans.User;

public interface UserServices {

	public int addUser(User user);
	public List<User> findUserbyName(String name);
	public int updatebyPhone(int userId, long newPhoneno);
	public boolean Validate(int userId, String userName, String userPass );
}