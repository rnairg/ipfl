package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipfl.data.domains.RelationshipTemp;
import com.ipfl.services.IpflPLRelationshipService;

@RestController
@RequestMapping("/plRelationship")
public class IpflPLRelationshipController implements IpflController<RelationshipTemp> {
	
	@Autowired
	IpflPLRelationshipService ipflPLRelationshipService;
	
	@Override
	public List<RelationshipTemp> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<RelationshipTemp> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RelationshipTemp> create(List<RelationshipTemp> rt) {
		
			ipflPLRelationshipService.create(rt);
	
		return null;
	}

	@Override
	public void delete(List<RelationshipTemp> rt) {
		// TODO Auto-generated method stub
		
	}
}
