package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.beans.CardDetails;

@Repository
public class CardDetailsDaoImpl implements CardDetailsDao {

	@Autowired
	EntityManager em;
	
	@Override
	@Transactional
	public int addCard(int userId, String cardType, double cardLimit) {
		CardDetails card=new CardDetails();
		card.setUserId(userId);
		card.setCardType(cardType);
		card.setCardLimit(cardLimit);
		em.persist(card);		
		return card.getCardNo();
	}

	@Override
	public List<CardDetails> getAllCard() {
		Query qry=em.createQuery("select c from CardDetails c");
		List<CardDetails> myList=qry.getResultList();
		return myList;
	}

	@Override
	public List<CardDetails> getCardbyId(int userId) {
		Query qry=em.createQuery("select c from CardDetails c where c.userId=:id");
		qry.setParameter("id", userId);
		List<CardDetails> myList=qry.getResultList();
		return myList;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
