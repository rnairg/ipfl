package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.PlayerStats;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPlayerMatchRelationshipService")
public class IpflPlayerMatchRelationshipService implements IpflRelationshipService<PlayerStats> {

	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public List<PlayerStats> create(List<PlayerStats> rt) {
		for(PlayerStats rt1 : rt) {
			playerRepository.createPlayerMatchRelationship(rt1.getPlayer().getName(),rt1.getMatch().getName(),rt1.getRuns(),rt1.getWickets(),rt1.getCatches());
		}
		return null;
	}

	@Override
	public void delete(List<PlayerStats> rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PlayerStats> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PlayerStats> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PlayerStats> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> update(List<PlayerStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

}
