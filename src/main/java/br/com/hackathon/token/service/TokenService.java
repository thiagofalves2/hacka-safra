package br.com.hackathon.token.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.builder.TokenBuilder;
import br.com.hackathon.db.entity.CardHolder;
import br.com.hackathon.db.service.TokenDBService;
import br.com.hackathon.db.service.CardHolderDBService;
import br.com.hackathon.exceptions.TokenNotFoundException;
import br.com.hackathon.exceptions.TokenUsedException;
import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;
import br.com.hackathon.token.dto.TokenDTO;

@Service
public class TokenService {
	
	@Autowired
	private CardHolderDBService userService;
	
	@Autowired
	private TokenDBService tokenDBService;
	
	public TokenDTO doValidateToken(String document, String strToken) throws UserNotFoundException, UserBlockException, TokenNotFoundException, TokenUsedException {
		CardHolder cardHolder = userService.getByDocument(document);
		tokenDBService.validateToken(cardHolder.getId(), strToken);
		return TokenBuilder.getInstance().getTokenDTO();
	}

}
