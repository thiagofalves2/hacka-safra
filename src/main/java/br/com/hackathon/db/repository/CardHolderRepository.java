package br.com.hackathon.db.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.hackathon.db.entity.CardHolder;

public interface CardHolderRepository extends CrudRepository<CardHolder, Long> {
	
	CardHolder findByDocument(String document);
	
}
