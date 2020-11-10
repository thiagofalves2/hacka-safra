package br.com.hackathon.builder;

import br.com.hackathon.token.dto.TokenDTO;

public class TokenBuilder {
	
	private static TokenBuilder instance;
	
	private TokenBuilder() {
		
	}
	
	public static TokenBuilder getInstance() {
		if(instance == null) {
			instance = new TokenBuilder();
		}
		return instance;
	}
	
	public TokenDTO getTokenDTO() {
		TokenDTO tokenDTO = new TokenDTO();
		tokenDTO.setStatus(Boolean.TRUE);
		return tokenDTO;
	}
	
}
