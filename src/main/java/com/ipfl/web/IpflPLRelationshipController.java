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
		
			ipflPLRelationshipService.create(rt);
	
		return null;
	}
}
