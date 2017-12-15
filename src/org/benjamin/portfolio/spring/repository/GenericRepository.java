package org.benjamin.portfolio.spring.repository;

import java.util.List;

public interface GenericRepository<E extends HasKey> {
	
	default E add(E entity) {
		return update(entity);
	}
	
	List<E> findAll();
	
	E find(HasKey keyHolder);
	
	E update(E entity);
	
	E remove(HasKey keyHolder);

}
