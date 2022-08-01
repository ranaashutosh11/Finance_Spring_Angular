package com.lti.dao;

import java.util.List;

import com.lti.beans.CardDetails;

public interface CardDetailsDao {
	
	public int addCard(int userId, String cardType, double cardLimit);
	public List<CardDetails> getAllCard();
	public List<CardDetails> getCardbyId(int userId);
	public double getBalance();


}
