package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.Match;
import com.ipfl.data.dto.MatchDTO;
import com.ipfl.data.repositories.MatchRepository;

@Service("ipflMatchDataService")
public class IpflMatchDataService implements IpflDataService<Match> {
	
	@Autowired
	MatchRepository matchRepository;

	@Override
	public List<Match> saveAll(List<Match> m) {
		List<Match> result = new ArrayList<>();
		matchRepository.saveAll(m).forEach(result::add);
		return result;
	}

	@Override
	public void deleteAll(List<Match> m) {
		  matchRepository.deleteAll(m);
		
	}

	@Override
	public Optional<Match> findById(long id) {
		return matchRepository.findById(id, Match.class);
	}

	@Override
	public List<MatchDTO> findAll() {
		List<MatchDTO> result = new ArrayList<>();
		matchRepository.findAllProjectedBy(MatchDTO.class).forEach(result::add);
		return result;
	}

	@Override
	public Optional<MatchDTO> findByName(String name) {
		return matchRepository.findByName(name, MatchDTO.class);
	}

	@Override
	public List<Match> updateAll(List<Match> m) {
		List<Match> result = new ArrayList<>();
		matchRepository.saveAll(m).forEach(result::add);
		return result;
		
		
	}

	@Override
	public List<MatchDTO> findByRelatedNode(String nodeName, String relationName) {
		return matchRepository.findByRelatedNode(nodeName,relationName);
	}

	@Override
	public Match save(Match t) {
		return matchRepository.save(t);
	}

	@Override
	public void delete(Match t) {
		matchRepository.delete(t);
		
	}

}
