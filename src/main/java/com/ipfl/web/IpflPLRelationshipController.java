package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipfl.data.domains.RelationshipTemp;
import com.ipfl.services.IpflPLTeamBuilderService;

@RestController
@RequestMapping("/plRelationship")
public class IpflPLRelationshipController implements IpflController<RelationshipTemp> {
	
	@Autowired
	IpflPLTeamBuilderService ipflPLTeamBuilderService;
	
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
		
		for(RelationshipTemp rt1:rt) {
			ipflPLTeamBuilderService.buildTeam(rt1.getStartNode(), rt1.getEndNode(), rt1.getRoles());
		}
		return null;
	}

	@Override
	public void delete(List<RelationshipTemp> o) {
		// TODO Auto-generated method stub
		
	}
}
