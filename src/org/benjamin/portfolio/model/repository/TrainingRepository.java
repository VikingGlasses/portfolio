package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Training;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Mongo specific repository interface for handling training examples.
 * 
 * @author Benjamin Rosman
 * @see MongoRepository
 * @see Training
 *
 */
@RepositoryDefinition(domainClass=Training.class, idClass = String.class)
public interface TrainingRepository extends MongoRepository<Training, String> {

}
