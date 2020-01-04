package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.MatchStats;
import com.ipfl.data.repositories.IpflPLTeamMatchRelationshipRepository;

@Service("ipflMatchRelationshipService")
public class IpflPLTeamMatchRelationshipService implements IpflRelationshipService<MatchStats> {

	@Autowired
	private IpflPLTeamMatchRelationshipRepository ipflPLTeamMatchRelationshipRepository;
	
	@Override
	public List<MatchStats> createMultiple(List<MatchStats> rt) {
		List<MatchStats> result = new ArrayList<>();
		ipflPLTeamMatchRelationshipRepository.saveAll(rt).forEach(result::add);
		return result;
	}

	@Override
	public void deleteMultiple(List<MatchStats> t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<MatchStats> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MatchStats> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MatchStats> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MatchStats> updateMultiple(List<MatchStats> t) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MatchStats> createByNodeNames(List<MatchStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

}
