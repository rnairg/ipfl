package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.RelationshipTemp;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPlayerMatchRelationshipService")
public class IpflPlayerMatchRelationshipService implements IpflDataService<RelationshipTemp> {

	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public List<RelationshipTemp> create(List<RelationshipTemp> rt) {
		for(RelationshipTemp rt1 : rt) {
			playerRepository.createPlayerMatchRelationship(rt1.getStartNode(),rt1.getEndNode(),rt1.getRuns(),rt1.getWickets(),rt1.getCatches());
		}
		return null;
	}

	@Override
	public void delete(List<RelationshipTemp> rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<RelationshipTemp> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RelationshipTemp> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
