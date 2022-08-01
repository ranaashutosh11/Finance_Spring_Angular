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
	public int addCard(int userId, String cardType, double cardLimit) {
		return dao.addCard(userId, cardType, cardLimit);
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
	public double getBalance() {
		return dao.getBalance();
	}

}
