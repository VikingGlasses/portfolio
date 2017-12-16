package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Training;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass=Training.class, idClass = String.class)
public interface TrainingRepository extends MongoRepository<Training, String> {

}
