package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.data.domains.PLTeam;
import com.ipfl.services.IpflPLTeamDataService;

@RestController
@RequestMapping("/plteam")
public class IpflPLTeamController implements IpflController<PLTeam> {
	
	@Autowired
	IpflPLTeamDataService ipltds;

	@Override
	public List<PLTeam> findAll() {
		return (List<PLTeam>) ipltds.findAll();
	}

	@Override
	public Optional<PLTeam> findById(int id) {
	
		return ipltds.findById(id);
	}

	@Override
	public PLTeam create(PLTeam t) {
		
		return ipltds.create(t);
	}

	@Override
	public void delete(PLTeam t) {
		ipltds.delete(t);
		
	}

}
