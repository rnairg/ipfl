package com.ipfl.services;

import java.util.List;
import java.util.Optional;

public interface IpflRelationshipService<R> {
	
	List<R> create (List<R> t);
	void delete (List<R> t);
	List<R> update (List<R> t);
	Optional<R> findById(long id);
	Iterable<R> findAll();
	Optional<R> findByName(String name);

}
