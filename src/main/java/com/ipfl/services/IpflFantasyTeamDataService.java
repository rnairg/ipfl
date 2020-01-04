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
	public List<FantasyTeam> createMultiple(List<FantasyTeam> ft) {
		
		List<FantasyTeam> result = new ArrayList<>();
		fantasyTeamRepository.saveAll(ft).forEach(result::add);
		return result;
	}

	@Override
	public void deleteMultiple(List<FantasyTeam> ft) {
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
	public List<FantasyTeam> findAll() {
		List<FantasyTeam> result = new ArrayList<>();
		fantasyTeamRepository.findAll().forEach(result::add);
		return result;
	}

	@Override
	public Optional<FantasyTeam> findByName(String name) {
		return fantasyTeamRepository.findByName(name);
	}

	@Override
	public List<FantasyTeam> updateMultiple(List<FantasyTeam> ft) {
		List<FantasyTeam> result = new ArrayList<>();
		fantasyTeamRepository.saveAll(ft).forEach(result::add);
		return result;

	}

}
