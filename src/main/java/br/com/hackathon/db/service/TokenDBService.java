package br.com.hackathon.db.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.db.entity.Token;
import br.com.hackathon.db.repository.TokenRepository;
import br.com.hackathon.exceptions.TokenNotFoundException;
import br.com.hackathon.exceptions.TokenUsedException;

@Service
public class TokenDBService {
	
	@Autowired
	private TokenRepository tokenRepository;
	
	
	public void validateToken(Long CardHolder, String strToken) throws TokenNotFoundException, TokenUsedException {
		Token token = tokenRepository.findByCardHolderAndToken(CardHolder, strToken); 
		if(token == null) {
			throw new TokenNotFoundException("Token not found");
		}
		
		if(token.getDtValidated() != null) {
			throw new TokenUsedException("Token already used");
		}
		
		token.setDtValidated(new Date());
		tokenRepository.save(token);
	}
	
	public void save(Long cardHolder, String strToken) {
		Token token = new Token();
		token.setDtSend(new Date());
		token.setCardHolder(cardHolder);
		token.setToken(strToken);
		tokenRepository.save(token);
	}
	
	
	public void updateTokenToUser(Token token) {
		token.setDtValidated(new Date());
		tokenRepository.save(token);
	}
	
}
