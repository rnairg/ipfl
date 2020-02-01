package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.PLTeam;
import com.ipfl.data.dto.PLTeamDTO;
import com.ipfl.data.repositories.PLTeamRepository;

@Service
public class IpflPLTeamDataService implements IpflDataService<PLTeam> {
	
	@Autowired
	PLTeamRepository pLTeamRepository;

	@Override
	public List<PLTeam> saveAll(List<PLTeam> plt) {
		List<PLTeam> result = new ArrayList<>();
		pLTeamRepository.saveAll(plt).forEach(result::add);
		return result;
	}

	@Override
	public void deleteAll(List<PLTeam> plt) {
			pLTeamRepository.deleteAll(plt);
		
	}

	@Override
	public Optional<PLTeam> findById(long id) {
		return pLTeamRepository.findById(id, PLTeam.class);
	}

	@Override
	public List<PLTeamDTO> findAll() {
		List<PLTeamDTO> result = new ArrayList<>();
		pLTeamRepository.findAllProjectedBy(PLTeamDTO.class).forEach(result::add);
		return result;
	}

	@Override
	public Optional<PLTeamDTO> findByName(String name) {
		return pLTeamRepository.findByName(name, PLTeamDTO.class);
	}

	@Override
	public List<PLTeam> updateAll(List<PLTeam> plt) {
		List<PLTeam> result = new ArrayList<>();
		pLTeamRepository.saveAll(plt).forEach(result::add);
		return result;
		
	}

	@Override
	public List<PLTeamDTO> findByRelatedNode(String nodeName, String relationName) {
		return pLTeamRepository.findByRelatedNode(nodeName, relationName);
	}

	@Override
	public PLTeam save(PLTeam t) {
		return pLTeamRepository.save(t);
	}

	@Override
	public void delete(PLTeam t) {
		pLTeamRepository.delete(t);
		
	}

}
