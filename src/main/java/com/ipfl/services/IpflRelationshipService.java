package com.ipfl.services;

import java.util.List;
import java.util.Optional;

public interface IpflRelationshipService<R> {
	
	//Bulk Operations
	List<R> createMultiple (List<R> t);
	List<R> createByNodeNames (List<R> t);
	void deleteMultiple (List<R> t);
	List<R> updateMultiple (List<R> t);
	List<R> findAll();
	
	//Single Operations
	Optional<R> findById(long id);
	Optional<R> findByName(String name);

}
