package br.com.hackathon.db.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.hackathon.db.entity.Token;

public interface TokenRepository  extends CrudRepository<Token, Long> {
	
	public Token findByCardHolderAndToken(Long idUser, String token);

}
