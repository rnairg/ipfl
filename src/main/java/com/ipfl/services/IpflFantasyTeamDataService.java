package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
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
			fantasyTeamRepository.delete(
					fantasyTeamRepository.findByName(ft1.getName()).get()
					);
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

	@Override
	public Optional<FantasyTeam> findByName(String name) {
		return fantasyTeamRepository.findByName(name);
	}

	@Override
	public void update(List<FantasyTeam> ft) {
		for(FantasyTeam ft1 : ft)
		{
		  fantasyTeamRepository.save(ft1);
		}
		
	}

}
