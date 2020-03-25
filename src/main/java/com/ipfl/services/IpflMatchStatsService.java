package com.ipfl.services;

import com.ipfl.data.domains.MatchStats;
import com.ipfl.data.domains.Node;
import com.ipfl.data.repositories.MatchStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service("ipflMatchStatsService")
public class IpflMatchStatsService implements IpflDataService<MatchStats> {

    @Autowired
    private MatchStatsRepository matchStatsRepository;

    @Override
    public List<MatchStats> saveAll(List <MatchStats> ms) {
        List<MatchStats> result = new ArrayList<>();
        matchStatsRepository.saveAll(ms).forEach(result::add);
        return result;
    }

    @Override
    public void deleteAll(List <MatchStats> ms) {

        matchStatsRepository.deleteAll(ms);

    }

    @Override
    public List<MatchStats> updateAll(List<MatchStats> ms) {
        List<MatchStats> result = new ArrayList<>();
        matchStatsRepository.saveAll(ms).forEach(result::add);
        return result;
    }

    @Override
    public List<?> findAll() {
        List<MatchStats> result = new ArrayList<>();
        matchStatsRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public List<?> findByRelatedNode(String nodeName, String relationName) {
        return null;
    }

    @Override
    public Optional<?> findById(long id) {
        return matchStatsRepository.findById(id);
    }

    @Override
    public Optional<?> findByName(String name) {
        return matchStatsRepository.findByName(name);
    }

    @Override
    public MatchStats save(MatchStats ms) {
        return matchStatsRepository.save(ms);
    }

    @Override
    public void delete(MatchStats ms) {
        matchStatsRepository.delete(ms);
    }
}
