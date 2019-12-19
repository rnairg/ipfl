package com.ipfl.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.PLTeam;
import com.ipfl.data.repositories.PLTeamRepository;

@Service
public class IpflPLTeamDataService implements IpflDataService<PLTeam> {
	
	@Autowired
	PLTeamRepository pLTeamRepository;

	@Override
	public PLTeam create(PLTeam pt) {
		return pLTeamRepository.save(pt);
	}

	@Override
	public void delete(PLTeam pt) {
		pLTeamRepository.delete(pt);
		
	}

	@Override
	public Optional<PLTeam> findById(long id) {
		return pLTeamRepository.findById(id);
	}

	@Override
	public Iterable<PLTeam> findAll() {
		return pLTeamRepository.findAll();
	}

}
