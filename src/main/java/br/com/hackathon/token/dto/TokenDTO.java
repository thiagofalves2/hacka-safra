package br.com.hackathon.token.dto;

import br.com.hackathon.dto.AbstractHTTP;

public class TokenDTO extends AbstractHTTP {
	
	private Boolean status;
	
	public TokenDTO() {
		
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
