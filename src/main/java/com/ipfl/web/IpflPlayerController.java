package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.Player;
import com.ipfl.services.IpflPlayerDataService;

@RestController
@RequestMapping("/player")
public class IpflPlayerController implements IpflController<Player> {
	
	@Autowired
	IpflPlayerDataService ipds;
	@Override
	public List<Player> findAll() {
		
		return (List<Player>) ipds.findAll();
	}

	@Override
	public Optional<Player> findById(int id) {
		
		return ipds.findById(id);
	}

	@Override
	public Player create(Player p) {
		
		return ipds.create(p);
	}

	@Override
	public void delete(Player p) {
		
		ipds.delete(p);	
	}
	
}

