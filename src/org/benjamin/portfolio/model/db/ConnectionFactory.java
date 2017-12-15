package org.benjamin.portfolio.model.db;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.mongodb.MongoClient;

@Stateless
public class ConnectionFactory {

	@ApplicationScoped
	@Produces
	public MongoClient getClient() {
		return new MongoClient();
	}
	
}
