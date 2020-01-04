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
	public List<Player> createMultiple(List<Player> p) {
		List<Player> result = new ArrayList<>();
		playerRepository.saveAll(p).forEach(result::add);
		return result;
	}

	@Override
	public void deleteMultiple(List<Player> p) {
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
	public List<Player> findAll() {
		List<Player> result = new ArrayList<>();
		playerRepository.findAll().forEach(result::add);
		return result;
	}

	@Override
	public Optional<Player> findByName(String name) {

		return playerRepository.findByName(name);
	}

	@Override
	public List<Player> updateMultiple(List<Player> p) {
		List<Player> result = new ArrayList<>();
		playerRepository.saveAll(p).forEach(result::add);
		return result;
	}

}
