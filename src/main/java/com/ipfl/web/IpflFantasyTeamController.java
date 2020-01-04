package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.FantasyTeam;
import com.ipfl.services.IpflDataService;

@RestController
@RequestMapping("/fTeams")
public class IpflFantasyTeamController implements IpflController<FantasyTeam> {
	
	@Autowired
	IpflDataService<FantasyTeam> iptds;

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
		return iptds.createMultiple(ft);
	}

	@Override
	public void delete(List<FantasyTeam> ft) {
		iptds.deleteMultiple(ft);
		
	}

	@Override
	public Optional<FantasyTeam> findByName(String name) {
		return iptds.findByName(name);
	}

	@Override
	public List<FantasyTeam> update(List<FantasyTeam> ft) {
		return iptds.updateMultiple(ft);
		
	}
}
