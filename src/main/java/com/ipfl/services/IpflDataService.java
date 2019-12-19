package com.ipfl.services;

import java.util.Optional;

public interface IpflDataService <T>{
	
	T create (T t);
	void delete (T t);
	Optional<T> findById(long id);
	Iterable<T> findAll();
}
