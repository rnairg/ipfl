package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
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
	public List<PLTeam> createMultiple(List<PLTeam> plt) {
		List<PLTeam> result = new ArrayList<>();
		pLTeamRepository.saveAll(plt).forEach(result::add);
		return result;
	}

	@Override
	public void deleteMultiple(List<PLTeam> plt) {
		for(PLTeam plt1 : plt)
		{
			pLTeamRepository.delete(
					pLTeamRepository.findByName(plt1.getName()).get()
					);
		}
	}

	@Override
	public Optional<PLTeam> findById(long id) {
		return pLTeamRepository.findById(id);
	}

	@Override
	public List<PLTeam> findAll() {
		List<PLTeam> result = new ArrayList<>();
		pLTeamRepository.findAll().forEach(result::add);
		return result;
	}

	@Override
	public Optional<PLTeam> findByName(String name) {
		return pLTeamRepository.findByName(name);
	}

	@Override
	public List<PLTeam> updateMultiple(List<PLTeam> plt) {
		List<PLTeam> result = new ArrayList<>();
		pLTeamRepository.saveAll(plt).forEach(result::add);
		return result;
		
	}

}
