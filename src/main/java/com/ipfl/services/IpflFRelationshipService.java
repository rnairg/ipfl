package com.ipfl.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.FRole;
import com.ipfl.data.repositories.IpflFRelationshipRepository;

@Service("ipflFRelationshipService")
public class IpflFRelationshipService implements IpflRelationshipService<FRole> {
	
	@Autowired
	private IpflFRelationshipRepository ipflFRelationshipRepository;


	@Override
	public List<FRole> createMultiple(List<FRole> rt) {		
		
		for(FRole rt1:rt) {
			if(rt1.getPlayer()!=null && rt1.getFteam()!=null)
			{
				if(rt1.getPlayer().getName()!=null && rt1.getFteam().getName()!=null && rt1.getStartDate()!=null)
				{

					ipflFRelationshipRepository.createByNodeNames(rt1.getPlayer().getName(),
							rt1.getFteam().getName(),
							rt1.getFroles(),
							rt1.getStartDate(),
							rt1.getEndDate());
				}
			}else {
				System.out.println("Player or Team is null");
			}
		}
		return null;
	}


	@Override
	public void deleteMultiple(List<FRole> t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<FRole> updateMultiple(List<FRole> t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<FRole> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<FRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<FRole> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<FRole> createByNodeNames(List<FRole> t) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
