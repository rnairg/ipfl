package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.MatchStats;
import com.ipfl.data.repositories.PLTeamRepository;

@Service("ipflMatchRelationshipService")
public class IpflMatchRelationshipService implements IpflRelationshipService<MatchStats> {

	@Autowired
	private PLTeamRepository pLTeamRepository;
	
	@Override
	public List<MatchStats> create(List<MatchStats> rt) {
		for(MatchStats rt1 : rt) {
			pLTeamRepository.createMatchRelationship(rt1.getPlTeam().getName(),rt1.getMatch().getName(),rt1.getRuns(),rt1.getWickets(),rt1.getOvers());
		}
		return null;
	}

	@Override
	public void delete(List<MatchStats> t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<MatchStats> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<MatchStats> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MatchStats> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MatchStats> update(List<MatchStats> t) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
