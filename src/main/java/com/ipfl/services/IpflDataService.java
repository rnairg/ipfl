package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import com.ipfl.data.domains.Node;

public interface IpflDataService <T extends Node>{
	
	//Bulk Operations
	List<T> createMultiple(List<T> t);
	void deleteMultiple (List<T> t);
	List<T> updateMultiple (List<T> t);
	List<T> findAll();
	
	//Single Operations
	Optional<T> findById(long id);
	Optional<T> findByName(String name);
}
