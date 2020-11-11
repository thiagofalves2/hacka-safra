package br.com.hackathon.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.db.entity.CardHolder;
import br.com.hackathon.db.repository.UserRepository;
import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;

@Service
public class CardHolderDBService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(CardHolder user) {
		userRepository.save(user);
	}
	
	public CardHolder getByDocument(String document) throws UserNotFoundException, UserBlockException {
		CardHolder user = userRepository.findByDocument(document);
		if(user == null) {
			throw new UserNotFoundException("CardHolder not found by document: "+document);
		}
		
		if(user.getDtBlock() != null) {
			throw new UserBlockException("CardHolder blocked to sign in");
		}
		return user;
	}
	
}
