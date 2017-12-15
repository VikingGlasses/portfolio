package org.benjamin.portfolio.spring.repository;

import java.util.List;

public class MongoRepository<E extends HasCollectionName> implements GenericRepository<E> {

	@Override
	public List<E> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E find(HasKey keyHolder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E update(E entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(HasKey keyHolder) {
		// TODO Auto-generated method stub
		return null;
	}

}
