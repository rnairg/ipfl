package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.FantasyTeam;
import com.ipfl.data.dto.FantasyTeamDTO;
import com.ipfl.data.repositories.FantasyTeamRepository;

@Service("ipflFantasyTeamDataService")
public class IpflFantasyTeamDataService implements IpflDataService<FantasyTeam> {
	
	@Autowired
	FantasyTeamRepository fantasyTeamRepository;

	@Override
	public List<FantasyTeam> saveAll(List<FantasyTeam> ft) {
		
		List<FantasyTeam> result = new ArrayList<>();
		fantasyTeamRepository.saveAll(ft).forEach(result::add);
		return result;
	}

	@Override
	public void deleteAll(List<FantasyTeam> ft) {
			fantasyTeamRepository.deleteAll(ft);
		
	}

	@Override
	public Optional<FantasyTeam> findById(long id) {
		return fantasyTeamRepository.findById(id, FantasyTeam.class);
	}

	@Override
	public List<FantasyTeamDTO> findAll() {
		List<FantasyTeamDTO> result = new ArrayList<>();
		fantasyTeamRepository.findAllProjectedBy(FantasyTeamDTO.class).forEach(result::add);
		return result;
	}

	@Override
	public Optional<FantasyTeamDTO> findByName(String name) {
		return fantasyTeamRepository.findByName(name, FantasyTeamDTO.class);
	}

	@Override
	public List<FantasyTeam> updateAll(List<FantasyTeam> ft) {
		List<FantasyTeam> result = new ArrayList<>();
		fantasyTeamRepository.saveAll(ft).forEach(result::add);
		return result;

	}

	@Override
	public List<FantasyTeamDTO> findByRelatedNode(String nodeName, String relationName) {
		return fantasyTeamRepository.findByRelatedNode(nodeName, relationName);
	}

	@Override
	public FantasyTeam save(FantasyTeam ft) {
		return fantasyTeamRepository.save(ft);
	}

	@Override
	public void delete(FantasyTeam ft) {
		fantasyTeamRepository.delete(ft);
		
	}

}
