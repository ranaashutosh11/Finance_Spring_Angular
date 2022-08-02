package com.lti.services;

import java.util.List;

import com.lti.beans.CardDetails;

public interface CardDetailsServices {

	public int addCard(int userId, String cardType, double cardLimit, double balance);
	public List<CardDetails> getAllCard();
	public List<CardDetails> getCardbyId(int userId);
	public double deductBalbyId(int userId, double amt);
	public double addBalbyId(int userId, double amt);
	
}
