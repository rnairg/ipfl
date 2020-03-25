package com.ipfl.web;

import com.ipfl.data.domains.MatchStats;
import com.ipfl.data.domains.Node;

import java.util.List;
import java.util.Optional;

public class IpflMatchStatsController implements IpflController<MatchStats> {


    @Override
    public List<?> findAll() {
        return null;
    }

    @Override
    public Optional<?> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<?> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<MatchStats> create(List<MatchStats> ms) {
        return null;
    }

    @Override
    public void delete(List<MatchStats> ms) {

    }

    @Override
    public List<MatchStats> update(List<MatchStats> t) {
        return null;
    }

    @Override
    public List<?> findByRelatedNode(String nodeName, String relationName) {
        return null;
    }

    @Override
    public MatchStats create(MatchStats ms) {
        return null;
    }

    @Override
    public void delete(MatchStats ms) {

    }

    @Override
    public MatchStats update(MatchStats ms) {
        return null;
    }
}
