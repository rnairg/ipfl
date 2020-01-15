package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.PlayerStats;
import com.ipfl.data.repositories.IpflPlayerMatchRelationshipRepository;

@Service("ipflPlayerMatchRelationshipService")
public class IpflPlayerMatchRelationshipService implements IpflRelationshipService<PlayerStats> {

	@Autowired
	IpflPlayerMatchRelationshipRepository ipflPlayerMatchRelationshipRepository;
	
	@Autowired
	PointService pointService;
	
	@Override
	public List<PlayerStats> createMultiple(List<PlayerStats> rt) {
		for(PlayerStats rt1:rt) {
			if(rt1.getPlayer()!=null && rt1.getMatch()!=null)
			{
				if(rt1.getPlayer().getName()!=null && rt1.getMatch().getName()!=null)
				{
					
					rt1 = pointService.calculatePoints(rt1);
					ipflPlayerMatchRelationshipRepository.createByNodeNames(rt1.getPlayer().getName(),
							rt1.getMatch().getName(),
							rt1.getRuns(),
							rt1.getWickets(),
							rt1.getCatches(),
							rt1.getPoints());
				}
			}else {
				System.out.println("Player or Team is null");
			}
		}
		return null;
	}

	@Override
	public void deleteMultiple(List<PlayerStats> rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PlayerStats> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PlayerStats> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> updateMultiple(List<PlayerStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerStats> createByNodeNames(List<PlayerStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

}
