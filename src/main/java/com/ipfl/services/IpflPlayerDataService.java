package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.Player;
import com.ipfl.data.dto.PlayerDTO;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPlayerDataService")
public class IpflPlayerDataService implements IpflDataService<Player> {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public List<Player> saveAll(List<Player> p) {
		List<Player> result = new ArrayList<>();
		playerRepository.saveAll(p).forEach(result::add);
		return result;
	}

	@Override
	public void deleteAll(List<Player> p) {
				 
			playerRepository.deleteAll(p);
		
	}

	@Override
	public Optional<Player> findById(long id) {
		return playerRepository.findById(id, Player.class);
	}

	@Override
	public List<PlayerDTO> findAll() {
		List<PlayerDTO> result = new ArrayList<>();
		playerRepository.findAllProjectedBy(PlayerDTO.class).forEach(result::add);
		return result;
	}

	@Override
	public Optional<PlayerDTO> findByName(String name) {

		return playerRepository.findByName(name, PlayerDTO.class);
	}

	@Override
	public List<Player> updateAll(List<Player> p) {
		List<Player> result = new ArrayList<>();
		playerRepository.saveAll(p).forEach(result::add);
		return result;
	}
	
	@Override
	public List<PlayerDTO> findByRelatedNode(String nodeName, String relationName){
		
		return playerRepository.findByRelatedNode(nodeName,relationName);
	}

	@Override
	public Player save(Player t) {
		return playerRepository.save(t);
	}

	@Override
	public void delete(Player t) {
		playerRepository.delete(t);
		
	}

}
