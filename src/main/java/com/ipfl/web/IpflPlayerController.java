package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.Player;
import com.ipfl.services.IpflDataService;

@RestController
@RequestMapping("/player")
public class IpflPlayerController implements IpflController<Player> {
	
	@Autowired
	IpflDataService<Player> ipds;
	
	@Override
	public List<?> findAll() {
		
		return ipds.findAll();
	}

	@Override
	public Optional<?> findById(Long id) {
		
		return ipds.findById(id);
	}
	

	@Override
	public List<Player> create(List<Player> p) {
		
		return ipds.saveAll(p);
	}

	@Override
	public void delete(List<Player> p) {
		
		ipds.deleteAll(p);	
	}

	@Override
	public Optional<?> findByName(String name) {
		
		return ipds.findByName(name);
	}

	@Override
	public List<Player> update(List<Player> p) {
		return ipds.saveAll(p);
		
	}
	
	@Override
	public List<?> findByRelatedNode(String nodeName, String relationName) {
		return ipds.findByRelatedNode(nodeName, relationName);
		
	}

	@Override
	public Player create(Player t) {
		return ipds.save(t);
	}

	@Override
	public void delete(Player t) {
		ipds.delete(t);
		
	}

	@Override
	public Player update(Player t) {
		return ipds.save(t);
	}
}


