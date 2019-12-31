package com.ipfl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.MatchStats;
import com.ipfl.services.IpflRelationshipService;

@RestController
@RequestMapping("/matchRelationship")
public class IpflMatchRelationshipController implements IpflRelationshipController<MatchStats> {

	@Autowired
	private IpflRelationshipService<MatchStats> ipflMatchRelationshipService;
	

	@Override
	public List<MatchStats> create(List<MatchStats> rt) {
		ipflMatchRelationshipService.create(rt);
		return null;
	}

}
