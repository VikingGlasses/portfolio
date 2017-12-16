package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Token;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Mongo specific repository interface for handling tokens.
 * 
 * @author Benjamin Rosman
 * @see MongoRepository
 * @see Token
 *
 */
@RepositoryDefinition(domainClass = Token.class, idClass = String.class)
public interface TokenRepository extends MongoRepository<Token, String> {
	
}
