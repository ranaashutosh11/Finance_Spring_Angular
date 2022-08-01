package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.CardDetails;
import com.lti.services.CardDetailsServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/card-api")
public class CardDetailsController {
	
	@Autowired
	CardDetailsServices services;

	// http://localhost:8060/card-api/addcard/101/Gold
	
	@PostMapping("/addcard/{userId}/{cardType}")
	public String addCard(@PathVariable("userId") int userId, @PathVariable("cardType") String cardType) {
		CardDetails card=new CardDetails();
		if(cardType.equalsIgnoreCase("Gold")) {
			card.setCardLimit(500000);
		}
		else if(cardType.equalsIgnoreCase("Titanium")) {
			card.setCardLimit(1000000);
		}
		int cardNo=services.addCard(userId, cardType, card.getCardLimit());
		return "Card No "+ cardNo+" added";
	}
	
	// http://localhost:8060/card-api/getallcards
	
	@GetMapping("/getallcards")
	public List<CardDetails> getAllCards(){
		List<CardDetails> myList=services.getAllCard();
		return myList;
	}
	
	// http://localhost:8060/card-api/getcardbyid/134
	
	@GetMapping("/getcardbyid/{userId}")
	public List<CardDetails> getCardbyId(@PathVariable("userId") int userId){
		List<CardDetails> card=services.getCardbyId(userId);
		return card;
	}
}
