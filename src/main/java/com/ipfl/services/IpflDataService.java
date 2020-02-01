package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import com.ipfl.data.domains.Node;

public interface IpflDataService <T extends Node>{
	
	//Bulk Operations
	List<T> saveAll(List<T> t);
	void deleteAll(List<T> t);
	List<T> updateAll(List<T> t);
	List<?> findAll();
	List<?> findByRelatedNode(String Nodename, String relationName);
	
	
	//Single Operations
	Optional<?> findById(long id);
	Optional<?> findByName(String name);
	T save(T t);
	void delete(T t);
}
