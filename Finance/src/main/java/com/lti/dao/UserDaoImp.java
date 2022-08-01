package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.beans.User;
import com.lti.userexception.UserException;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	EntityManager em;

	@Override
	@Transactional
	public int addUser(User user) {
		em.persist(user);
		return user.getUserId();
	}
	
	@Override
	public List<User> getAllUsers() {
		Query qry=em.createQuery("select u from User u");
		List<User> myList=qry.getResultList();
		return myList;
	}


	@Override
	@Transactional
	public int updatebyPhone(int userId, long newPhoneno) {
		User user = em.find(User.class, userId);
		;
		user.setUserPhone(newPhoneno);
		User temp = em.merge(user);
		return temp.getUserId();
	}

	@Override
	@Transactional
	public List<User> findUserbyName(String name) {
		TypedQuery<User> qry = em.createQuery("select u from User u where u.userName=:name", User.class);
		qry.setParameter("name", name);
		List<User> myList = qry.getResultList();
		return myList;
	}

	@Override
	// Have to do exception handeling
	public boolean Validate(int userId, String userName, String userPass) throws UserException {
		try {
		User user = em.find(User.class, userId);
		if ((user.getUserName()).equalsIgnoreCase(userName) && (user.getUserPass()).equals(userPass)) {
			return true;
		} else {
			return false;
		}
	}
		catch(Exception e) {
			throw new UserException("User not found");
		}
	}

	

	
}
