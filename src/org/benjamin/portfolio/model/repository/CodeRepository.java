package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Code;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

@RepositoryDefinition(domainClass=Code.class, idClass = String.class)
public interface CodeRepository extends MongoRepository<Code, String> {

	Code findByCode(@Param("code") String code);
	
}
