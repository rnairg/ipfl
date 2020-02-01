package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipfl.data.domains.Match;
import com.ipfl.services.IpflDataService;

@RestController
@RequestMapping("/match")
public class IpflMatchController implements IpflController<Match> {
	
	@Autowired
	IpflDataService<Match> ipmds;

	@Override
	public List<?> findAll() {
		return  ipmds.findAll();
	}

	@Override
	public Optional<?> findById(Long id) {
		return ipmds.findById(id);
	}

	@Override
	public List<Match> create(List<Match> m) {
		return ipmds.saveAll(m);
	}

	@Override
	public void delete(List<Match> m) {
		ipmds.deleteAll(m);
		
	}

	@Override
	public Optional<?> findByName(String name) {
		return ipmds.findByName(name);
	}

	@Override
	public List<Match> update(List<Match> m) {
		return ipmds.saveAll(m);
		
	}

	@Override
	public List<?> findByRelatedNode(String nodeName, String relationName) {
		return ipmds.findByRelatedNode(nodeName, relationName);
	}

	@Override
	public Match create(Match t) {
		return ipmds.save(t);
	}

	@Override
	public void delete(Match t) {
		ipmds.delete(t);
		
	}

	@Override
	public Match update(Match t) {
		return ipmds.save(t);
	}

}
