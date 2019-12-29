package com.ipfl.fantasyTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.services.IpflDataService;

@Service("ipflFantasyTeamDataService")
public class IpflFantasyTeamDataService implements IpflDataService<FantasyTeam> {
	
	@Autowired
	FantasyTeamRepository fantasyTeamRepository;

	@Override
	public List<FantasyTeam> create(List<FantasyTeam> ft) {
		List<FantasyTeam> rft = new ArrayList<>();
		for(FantasyTeam ft1 : ft)
		{
		  rft.add(fantasyTeamRepository.save(ft1));
		}
		return rft;
	}

	@Override
	public void delete(List<FantasyTeam> ft) {
		for(FantasyTeam ft1 : ft)
		{
			fantasyTeamRepository.delete(ft1);
		}
		
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
