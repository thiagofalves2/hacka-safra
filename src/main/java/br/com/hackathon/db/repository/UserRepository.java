package br.com.hackathon.db.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.hackathon.db.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByDocument(String document);
	
}
