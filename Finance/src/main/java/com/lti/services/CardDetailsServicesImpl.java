package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.CardDetails;
import com.lti.dao.CardDetailsDao;

@Service
public class CardDetailsServicesImpl implements CardDetailsServices{

	@Autowired
	CardDetailsDao dao;
	
	@Override
	public int addCard(int userId, String cardType, double cardLimit, double balance) {
		return dao.addCard(userId, cardType, cardLimit, balance);
	}

	@Override
	public List<CardDetails> getAllCard() {
		return dao.getAllCard();
	}

	@Override
	public List<CardDetails> getCardbyId(int userId) {
		return dao.getCardbyId(userId);
	}

	@Override
	public double deductBalbyId(int userId, double amt) {
		return dao.deductBalbyId(userId, amt);
	}

	@Override
	public double addBalbyId(int userId, double amt) {
		return dao.addBalbyId(userId, amt);
	}

}
