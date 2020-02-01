package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.FantasyTeam;
import com.ipfl.services.IpflDataService;

@RestController
@RequestMapping("/fTeam")
public class IpflFantasyTeamController implements IpflController<FantasyTeam> {
	
	@Autowired
	IpflDataService<FantasyTeam> iptds;

	@Override
	public List<?> findAll() {
		return iptds.findAll();
	}

	@Override
	public Optional<?> findById(Long id) {
		return iptds.findById(id);
	}

	@Override
	public List<FantasyTeam> create(List<FantasyTeam> ft) {
		return iptds.saveAll(ft);
	}

	@Override
	public void delete(List<FantasyTeam> ft) {
		iptds.deleteAll(ft);
		
	}

	@Override
	public Optional<?> findByName(String name) {
		return iptds.findByName(name);
	}

	@Override
	public List<FantasyTeam> update(List<FantasyTeam> ft) {
		return iptds.updateAll(ft);
		
	}

	@Override
	public List<?> findByRelatedNode(String nodeName, String relationName) {
		return iptds.findByRelatedNode(nodeName, relationName);
	}

	@Override
	public FantasyTeam create(FantasyTeam t) {
		return iptds.save(t);
	}

	@Override
	public void delete(FantasyTeam t) {
		iptds.delete(t);
		
	}

	@Override
	public FantasyTeam update(FantasyTeam t) {
		return iptds.save(t);
	}
}
