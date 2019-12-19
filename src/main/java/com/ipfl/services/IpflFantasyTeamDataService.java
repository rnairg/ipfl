package com.ipfl.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.FantasyTeam;
import com.ipfl.data.repositories.FantasyTeamRepository;

@Service("ipflFantasyTeamDataService")
public class IpflFantasyTeamDataService implements IpflDataService<FantasyTeam> {
	
	@Autowired
	FantasyTeamRepository fantasyTeamRepository;

	@Override
	public FantasyTeam create(FantasyTeam ft) {
		return fantasyTeamRepository.save(ft);
	}

	@Override
	public void delete(FantasyTeam ft) {
		fantasyTeamRepository.delete(ft);
		
	}

	@Override
	public Optional<FantasyTeam> findById(long id) {
		return fantasyTeamRepository.findById(id);
	}

	@Override
	public Iterable<FantasyTeam> findAll() {
		return fantasyTeamRepository.findAll();
	}

}
