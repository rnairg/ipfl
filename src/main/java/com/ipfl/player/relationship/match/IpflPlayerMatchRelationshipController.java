package com.ipfl.player.relationship.match;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.RelationshipTemp;
import com.ipfl.services.IpflDataService;
import com.ipfl.web.IpflController;

@RestController
@RequestMapping("/playerMatchRelationship")
public class IpflPlayerMatchRelationshipController implements IpflController<RelationshipTemp> {

	@Autowired
	private IpflDataService<RelationshipTemp> ipflPlayerMatchRelationshipService;
	
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
		ipflPlayerMatchRelationshipService.create(rt);
		return null;
	}

	@Override
	public void delete(List<RelationshipTemp> rt) {
		// TODO Auto-generated method stub
		
	}

}
