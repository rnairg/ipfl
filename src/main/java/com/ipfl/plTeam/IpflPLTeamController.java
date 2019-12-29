package com.ipfl.plTeam;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipfl.services.IpflDataService;
import com.ipfl.web.IpflController;

@RestController
@RequestMapping("/plTeam")
public class IpflPLTeamController implements IpflController<PLTeam> {
	
	@Autowired
	IpflDataService<PLTeam> ipltds;

	@Override
	public List<PLTeam> findAll() {
		return (List<PLTeam>) ipltds.findAll();
	}

	@Override
	public Optional<PLTeam> findById(int id) {
	
		return ipltds.findById(id);
	}

	@Override
	public List<PLTeam> create(List<PLTeam> t) {
		
		return ipltds.create(t);
	}

	@Override
	public void delete(List<PLTeam> t) {
		ipltds.delete(t);
		
	}

}
