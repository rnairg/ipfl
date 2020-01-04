package com.ipfl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.MatchStats;
import com.ipfl.services.IpflRelationshipService;

@RestController
@RequestMapping("/matchRelationship")
public class IpflPLTeamMatchRelationshipController implements IpflRelationshipController<MatchStats> {

	@Autowired
	private IpflRelationshipService<MatchStats> ipflMatchRelationshipService;
	

	@Override
	public List<MatchStats> create(List<MatchStats> rt) {
		return ipflMatchRelationshipService.createMultiple(rt);
		
	}


	@Override
	public List<MatchStats> createByNodeNames(List<MatchStats> t) {
		
		return null;
	}

}
