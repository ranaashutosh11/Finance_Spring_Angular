package com.lti.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.beans.User;

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

}
