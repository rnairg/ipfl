package com.ipfl.plTeam.relationship.match;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.RelationshipTemp;
import com.ipfl.services.IpflDataService;
import com.ipfl.web.IpflController;

@RestController
@RequestMapping("/matchRelationship")
public class IpflMatchRelationshipController implements IpflController<RelationshipTemp> {

	@Autowired
	private IpflDataService<RelationshipTemp> ipflMatchRelationshipService;
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
		ipflMatchRelationshipService.create(rt);
		return null;
	}

	@Override
	public void delete(List<RelationshipTemp> t) {
		// TODO Auto-generated method stub
		
	}

}
