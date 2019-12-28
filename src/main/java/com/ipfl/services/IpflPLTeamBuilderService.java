package com.ipfl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.repositories.PlayerRepository;

@Service("ipflPLTeamBuilderService")
public class IpflPLTeamBuilderService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	IpflPLTeamDataService ipfltds;
	
	public void buildTeam(String playerName, String plteamName, List<String> plroles)
	{
		playerRepository.createRelationship(playerName, plteamName, plroles);
	
	}

}
