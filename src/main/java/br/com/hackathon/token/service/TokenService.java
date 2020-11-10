package br.com.hackathon.token.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.builder.TokenBuilder;
import br.com.hackathon.db.entity.User;
import br.com.hackathon.db.service.TokenDBService;
import br.com.hackathon.db.service.UserDBService;
import br.com.hackathon.exceptions.TokenNotFoundException;
import br.com.hackathon.exceptions.TokenUsedException;
import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;
import br.com.hackathon.token.dto.TokenDTO;

@Service
public class TokenService {
	
	@Autowired
	private UserDBService userService;
	
	@Autowired
	private TokenDBService tokenDBService;
	
	public TokenDTO doValidateToken(String document, String strToken) throws UserNotFoundException, UserBlockException, TokenNotFoundException, TokenUsedException {
		User user = userService.getByDocument(document);
		tokenDBService.validateToken(user.getId(), strToken);
		return TokenBuilder.getInstance().getTokenDTO();
	}

}
