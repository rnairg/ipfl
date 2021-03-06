package com.ipfl.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.FRole;
import com.ipfl.services.IpflRelationshipService;

@RestController
@RequestMapping("/fRelationship")
public class IpflFRelationshipController implements IpflRelationshipController<FRole> {

	@Autowired
	IpflRelationshipService<FRole> ipflFRelationshipService;

	
	public List<FRole> create(List<FRole> rt) {
		return ipflFRelationshipService.createMultiple(rt);
	}


	@Override
	public List<FRole> createByNodeNames(List<FRole> t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
