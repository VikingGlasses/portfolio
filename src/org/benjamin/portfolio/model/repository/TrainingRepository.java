package org.benjamin.portfolio.model.repository;

import org.benjamin.portfolio.model.bean.Training;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends MongoRepository<Training, String> {

}
