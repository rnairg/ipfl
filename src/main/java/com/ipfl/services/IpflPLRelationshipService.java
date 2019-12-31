package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.PLRole;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPLRelationshipService")
public class IpflPLRelationshipService implements IpflRelationshipService<PLRole> {
	
	@Autowired
	private PlayerRepository playerRepository;
	

	@Override
	public List<PLRole> create(List<PLRole> rt) {
		for(PLRole rt1:rt) {
			System.out.println("Player "+rt1.getPlayer());
			playerRepository.createPLRelationship(rt1.getPlayer().getName(),rt1.getPlteam().getName(),rt1.getPlroles());
		}
		return null;
	}


	@Override
	public void delete(List<PLRole> t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<PLRole> update(List<PLRole> t) {
		// TODO Auto-generated method stub
		return null;
		
	}


	@Override
	public Optional<PLRole> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterable<PLRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<PLRole> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
