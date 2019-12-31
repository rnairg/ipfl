package com.ipfl.services;

import java.util.List;
import java.util.Optional;

public interface IpflDataService <T>{
	
	List<T> create (List<T> t);
	void delete (List<T> t);
	void update (List<T> t);
	Optional<T> findById(long id);
	Iterable<T> findAll();
	Optional<T> findByName(String name);
}
