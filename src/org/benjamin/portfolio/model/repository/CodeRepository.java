package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Code;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * Mongo specific repository interface for handling codes.
 * 
 * @author Benjamin Rosman
 * @see MongoRepository
 * @see Code
 *
 */
@RepositoryDefinition(domainClass=Code.class, idClass = String.class)
public interface CodeRepository extends MongoRepository<Code, String> {

	/**
	 * Finds a single code document with code.
	 * @param code The code to lookup.
	 * @return Single code object or null if not found.
	 */
	Code findByCode(@Param("code") String code);
	
}
