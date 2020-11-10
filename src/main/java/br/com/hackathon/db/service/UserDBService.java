package br.com.hackathon.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.db.entity.User;
import br.com.hackathon.db.repository.UserRepository;
import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;

@Service
public class UserDBService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User getByDocument(String document) throws UserNotFoundException, UserBlockException {
		User user = userRepository.findByDocument(document);
		if(user == null) {
			throw new UserNotFoundException("User not found by document: "+document);
		}
		
		if(user.getDtBlock() != null) {
			throw new UserBlockException("User blocked to sign in");
		}
		return user;
	}
	
}
