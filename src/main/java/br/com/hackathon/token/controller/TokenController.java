package br.com.hackathon.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathon.exceptions.TokenNotFoundException;
import br.com.hackathon.exceptions.TokenUsedException;
import br.com.hackathon.exceptions.UserBlockException;
import br.com.hackathon.exceptions.UserNotFoundException;
import br.com.hackathon.token.dto.TokenDTO;
import br.com.hackathon.token.service.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/token")
@Api(value = "TOKEN", description = "API validacao de TOKEN")
public class TokenController {

	@Autowired
	private TokenService tokenService;
	
	@ApiOperation(value = "Validar Token")
	@PostMapping("/{document}/{token}")
	public ResponseEntity<TokenDTO> sendTokenBySMS(@PathVariable("document") String document, @PathVariable("token") String token) {
		TokenDTO tokenDTO = new TokenDTO();
		try {
			tokenDTO = tokenService.doValidateToken(document, token);
			tokenDTO.setHttpErrorDesc(HttpStatus.ACCEPTED.name());
			tokenDTO.setHttpStatus(HttpStatus.ACCEPTED.value());
		} catch (UserNotFoundException | UserBlockException | TokenNotFoundException | TokenUsedException e) {
			tokenDTO.setStatus(Boolean.FALSE);
			tokenDTO.setHttpErrorDesc(e.getMessage());
			tokenDTO.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		}
		return ResponseEntity.ok(tokenDTO);
	}
	
}
