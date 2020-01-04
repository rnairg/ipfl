package com.ipfl.services;

import java.util.List;
import java.util.Optional;

public interface IpflDataService <T>{
	
	//Bulk Operations
	List<T> createMultiple(List<T> t);
	void deleteMultiple (List<T> t);
	List<T> updateMultiple (List<T> t);
	List<T> findAll();
	
	//Single Operations
	Optional<T> findById(long id);
	Optional<T> findByName(String name);
}
