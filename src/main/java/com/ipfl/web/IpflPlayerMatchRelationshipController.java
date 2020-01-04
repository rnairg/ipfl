package com.ipfl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipfl.data.domains.PlayerStats;
import com.ipfl.services.IpflRelationshipService;

@RestController
@RequestMapping("/playerMatchRelationship")
public class IpflPlayerMatchRelationshipController implements IpflRelationshipController<PlayerStats> {

	@Autowired
	private IpflRelationshipService<PlayerStats> ipflPlayerMatchRelationshipService;
	
	

	@Override
	public List<PlayerStats> create(List<PlayerStats> rt) {
		return ipflPlayerMatchRelationshipService.createMultiple(rt);

	}



	@Override
	public List<PlayerStats> createByNodeNames(List<PlayerStats> t) {
		// TODO Auto-generated method stub
		return null;
	}

}
