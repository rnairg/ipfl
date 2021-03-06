package com.ipfl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipfl.data.domains.PLRole;
import com.ipfl.data.domains.PLTeam;
import com.ipfl.data.domains.Player;
import com.ipfl.data.repositories.IpflPLRelationshipRepository;
import com.ipfl.data.repositories.PLTeamRepository;
import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPLRelationshipService")
public class IpflPLRelationshipService implements IpflRelationshipService<PLRole> {
	
	@Autowired
	private IpflPLRelationshipRepository ipflRelationshipRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private PLTeamRepository pLTeamRepository;

	@Override
	public List<PLRole> createMultiple(List<PLRole> rt) {
		/*for(PLRole rt1:rt) {
			if(rt1.getPlayer()!=null && rt1.getPlteam()!=null)
			{
				if(rt1.getPlayer().getName()!=null && rt1.getPlteam().getName()!=null && rt1.getStartDate()!=null)
				{

					ipflRelationshipRepository.createByNodeNames(rt1.getPlayer().getName(),
							rt1.getPlteam().getName(),
							rt1.getPlroles(),
							rt1.getStartDate(),
							rt1.getEndDate());
				}
			}else {
				System.out.println("Player or Team is null");
			}
		}
		return null;*/
		for(PLRole rt1:rt) {
			Player p = playerRepository.findByName(rt1.getPlayer().getName(), Player.class).get();
			PLTeam pt = pLTeamRepository.findByName(rt1.getPlteam().getName(), PLTeam.class).get();
			ipflRelationshipRepository.save(new PLRole(p,pt,rt1.getPlroles(),rt1.getStartDate(),
					rt1.getEndDate()));
		}
		return null;
	}
	@Override
	public List<PLRole> createByNodeNames(List<PLRole> rt) {
	
		return null;
	}


	@Override
	public void deleteMultiple(List<PLRole> t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<PLRole> updateMultiple(List<PLRole> t) {
		// TODO Auto-generated method stub
		return null;
		
	}


	@Override
	public Optional<PLRole> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<PLRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<PLRole> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	


}
