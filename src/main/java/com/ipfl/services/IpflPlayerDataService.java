package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
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
	public List<Player> create(List<Player> p) {
		List<Player> rp = new ArrayList<>();
		for(Player p1 : p)
		{
		  rp.add(playerRepository.save(p1));
		}
		return rp;
	}

	@Override
	public void delete(List<Player> p) {
		for(Player p1 : p)
		{
			 
			playerRepository.delete(
									playerRepository.findByName(p1.getName()).get()
									);
		}
		
	}

	@Override
	public Optional<Player> findById(long id) {
		
		return playerRepository.findById(id);
	}

	@Override
	public Iterable<Player> findAll() {
		
		return playerRepository.findAll();
	}

	@Override
	public Optional<Player> findByName(String name) {

		return playerRepository.findByName(name);
	}

	@Override
	public void update(List<Player> p) {
		for(Player p1 : p)
		{
		  playerRepository.save(p1);
		}
		
	}

}
