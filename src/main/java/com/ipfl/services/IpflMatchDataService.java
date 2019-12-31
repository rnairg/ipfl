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
	public List<Match> create(List<Match> m) {
		List<Match> rm = new ArrayList<>();
		for(Match m1 : m)
		{
		  rm.add(matchRepository.save(m1));
		}
		return rm;
	}

	@Override
	public void delete(List<Match> m) {
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
	public Iterable<Match> findAll() {
		return matchRepository.findAll();
	}

	@Override
	public Optional<Match> findByName(String name) {
		return matchRepository.findByName(name);
	}

	@Override
	public void update(List<Match> m) {
		for(Match m1 : m)
		{
		  matchRepository.save(m1);
		}
		
	}

}
