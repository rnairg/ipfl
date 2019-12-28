package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipfl.data.domains.Match;
import com.ipfl.services.IpflMatchDataService;

@RestController
@RequestMapping("/match")
public class IpflMatchController implements IpflController<Match> {
	
	@Autowired
	IpflMatchDataService ipmds;

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
		return ipmds.create(m);
	}

	@Override
	public void delete(List<Match> m) {
		ipmds.delete(m);
		
	}

}
