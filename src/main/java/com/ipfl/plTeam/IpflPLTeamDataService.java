package com.ipfl.plTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.services.IpflDataService;

@Service
public class IpflPLTeamDataService implements IpflDataService<PLTeam> {
	
	@Autowired
	PLTeamRepository pLTeamRepository;

	@Override
	public List<PLTeam> create(List<PLTeam> plt) {
		List<PLTeam> rplt = new ArrayList<>();
		for(PLTeam plt1 : plt)
		{
		  rplt.add(pLTeamRepository.save(plt1));
		}
		return rplt;
	}

	@Override
	public void delete(List<PLTeam> plt) {
		for(PLTeam plt1 : plt)
		{
			pLTeamRepository.delete(plt1);
		}
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
