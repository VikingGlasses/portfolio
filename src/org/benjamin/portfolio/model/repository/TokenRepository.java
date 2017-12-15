package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Token;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Token.class, idClass = String.class)
public interface TokenRepository extends MongoRepository<Token, String> {
	
}
