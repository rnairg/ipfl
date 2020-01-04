package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.FRole;
import com.ipfl.data.repositories.IpflFRelationshipRepository;

@Service("ipflFRelationshipService")
public class IpflFRelationshipService implements IpflRelationshipService<FRole> {
	
	@Autowired
	private IpflFRelationshipRepository ipflFRelationshipRepository;


	@Override
	public List<FRole> createMultiple(List<FRole> rt) {		
		
		List<FRole> result = new ArrayList<>();
		
		ipflFRelationshipRepository.saveAll(rt).forEach(result::add);
		
		return result;
	}


	@Override
	public void deleteMultiple(List<FRole> t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<FRole> updateMultiple(List<FRole> t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<FRole> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<FRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<FRole> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<FRole> createByNodeNames(List<FRole> t) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
