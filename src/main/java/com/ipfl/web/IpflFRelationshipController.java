package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.RelationshipTemp;
import com.ipfl.services.IpflDataService;

@RestController
@RequestMapping("/fRelationship")
public class IpflFRelationshipController implements IpflController<RelationshipTemp> {

	@Autowired
	IpflDataService<RelationshipTemp> ipflFRelationshipService;

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
		ipflFRelationshipService.create(rt);
		
		return null;
	}

	@Override
	public void delete(List<RelationshipTemp> rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<RelationshipTemp> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(List<RelationshipTemp> t) {
		// TODO Auto-generated method stub
		
	}
	
}
