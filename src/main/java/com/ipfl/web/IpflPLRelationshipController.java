package com.ipfl.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.PLRole;
import com.ipfl.services.IpflRelationshipService;

@RestController
@RequestMapping("/plRelationship")
public class IpflPLRelationshipController implements IpflRelationshipController<PLRole> {
	
	@Autowired
	IpflRelationshipService<PLRole> ipflPLRelationshipService;

	@Override
	public List<PLRole> create(List<PLRole> rt) {
		
		return ipflPLRelationshipService.createMultiple(rt);
	
	
	}

	@Override
	public List<PLRole> createByNodeNames(List<PLRole> rt) {
		ipflPLRelationshipService.createByNodeNames(rt);
		return null;
	}
}
