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
	public List<Match> findAll() {
		return (List<Match>) ipmds.findAll();
	}

	@Override
	public Optional<Match> findById(int id) {
		return ipmds.findById(id);
	}

	@Override
	public List<Match> create(List<Match> m) {
		return ipmds.createMultiple(m);
	}

	@Override
	public void delete(List<Match> m) {
		ipmds.deleteMultiple(m);
		
	}

	@Override
	public Optional<Match> findByName(String name) {
		return ipmds.findByName(name);
	}

	@Override
	public List<Match> update(List<Match> m) {
		return ipmds.updateMultiple(m);
		
	}

}
