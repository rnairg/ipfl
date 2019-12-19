package com.ipfl.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.Player;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPlayerDataService")
public class IpflPlayerDataService implements IpflDataService<Player> {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player create(Player p) {
		return playerRepository.save(p);
	}

	@Override
	public void delete(Player p) {
		playerRepository.delete(p);
		
	}

	@Override
	public Optional<Player> findById(long id) {
		
		return playerRepository.findById(id);
	}

	@Override
	public Iterable<Player> findAll() {
		
		return playerRepository.findAll();
	}

}
