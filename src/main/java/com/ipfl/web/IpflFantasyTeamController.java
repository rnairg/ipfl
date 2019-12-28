package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ipfl.data.domains.FantasyTeam;
import com.ipfl.services.IpflFantasyTeamDataService;

public class IpflFantasyTeamController implements IpflController<FantasyTeam> {
	
	@Autowired
	IpflFantasyTeamDataService iptds;

	@Override
	public List<FantasyTeam> findAll() {
		return (List<FantasyTeam>) iptds.findAll();
	}

	@Override
	public Optional<FantasyTeam> findById(int id) {
		return iptds.findById(id);
	}

	@Override
	public List<FantasyTeam> create(List<FantasyTeam> ft) {
		return iptds.create(ft);
	}

	@Override
	public void delete(List<FantasyTeam> ft) {
		iptds.create(ft);
		
	}

	

}
