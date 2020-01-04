package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.PlayerStats;
import com.ipfl.data.repositories.IpflPlayerMatchRelationshipRepository;

@Service("ipflPlayerMatchRelationshipService")
public class IpflPlayerMatchRelationshipService implements IpflRelationshipService<PlayerStats> {

	@Autowired
	IpflPlayerMatchRelationshipRepository ipflPlayerMatchRelationshipRepository;
	
	@Override
	public List<PlayerStats> createMultiple(List<PlayerStats> rt) {
		List<PlayerStats> result = new ArrayList<>();
		ipflPlayerMatchRelationshipRepository.saveAll(rt).forEach(rt::add);
		return result;
	}

	@Override
	public void deleteMultiple(List<PlayerStats> rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PlayerStats> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PlayerStats> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> updateMultiple(List<PlayerStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> createByNodeNames(List<PlayerStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

}
