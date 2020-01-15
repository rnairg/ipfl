package com.ipfl.services;

import java.util.List;
import java.util.Optional;
import com.ipfl.data.domains.Relationship;


public interface IpflRelationshipService<R extends Relationship<?, ?>> {
	
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
