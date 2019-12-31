package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.FRole;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflFRelationshipService")
public class IpflFRelationshipService implements IpflRelationshipService<FRole> {
	
	@Autowired
	private PlayerRepository playerRepository;


	@Override
	public List<FRole> create(List<FRole> rt) {		
		for(FRole rt1:rt) {
			//System.out.println("Player Name: "+rt1.getPlayer().getName());
			playerRepository.createFRelationship(rt1.getPlayer().getName(),rt1.getFteam().getName(),rt1.getFroles());
		}
		return null;
	}


	@Override
	public void delete(List<FRole> t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<FRole> update(List<FRole> t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<FRole> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterable<FRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<FRole> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
