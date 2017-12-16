package org.benjamin.portfolio.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Configuration of MongoDB. This is where the connection to the DB is specified.
 * 
 * @author Benjamin Rosman
 * @see AbstractMongoConfiguration
 */
// TODO: Look up possibility of using property file for configuration settings
@Configuration 
@EnableMongoRepositories(basePackages= {"org.benjamin.portfolio.model.repository"})
public class MongodbConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "PortfolioDB";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient();
	}
	
}
