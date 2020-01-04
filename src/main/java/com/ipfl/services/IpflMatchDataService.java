package com.ipfl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.Match;
import com.ipfl.data.repositories.MatchRepository;

@Service("ipflMatchDataService")
public class IpflMatchDataService implements IpflDataService<Match> {
	
	@Autowired
	MatchRepository matchRepository;

	@Override
	public List<Match> createMultiple(List<Match> m) {
		List<Match> result = new ArrayList<>();
		matchRepository.saveAll(m).forEach(result::add);
		return result;
	}

	@Override
	public void deleteMultiple(List<Match> m) {
		for(Match m1 : m)
		{
		  matchRepository.delete(
				  matchRepository.findByName(m1.getName()).get()
				  );
		}
		
	}

	@Override
	public Optional<Match> findById(long id) {
		return matchRepository.findById(id);
	}

	@Override
	public List<Match> findAll() {
		List<Match> result = new ArrayList<>();
		matchRepository.findAll().forEach(result::add);
		return result;
	}

	@Override
	public Optional<Match> findByName(String name) {
		return matchRepository.findByName(name);
	}

	@Override
	public List<Match> updateMultiple(List<Match> m) {
		List<Match> result = new ArrayList<>();
		matchRepository.saveAll(m).forEach(result::add);
		return result;
		
		
	}

}
