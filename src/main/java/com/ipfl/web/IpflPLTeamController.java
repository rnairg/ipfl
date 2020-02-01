package com.ipfl.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipfl.data.domains.PLTeam;
import com.ipfl.services.IpflDataService;

@RestController
@RequestMapping("/plTeam")
public class IpflPLTeamController implements IpflController<PLTeam> {
	
	@Autowired
	IpflDataService<PLTeam> ipltds;

	@Override
	public List<?> findAll() {
		return ipltds.findAll();
	}

	@Override
	public Optional<?> findById(Long id) {
	
		return ipltds.findById(id);
	}

	@Override
	public List<PLTeam> create(List<PLTeam> t) {
		
		return ipltds.saveAll(t);
	}

	@Override
	public void delete(List<PLTeam> t) {
		ipltds.deleteAll(t);
		
	}

	@Override
	public Optional<?> findByName(String name) {
		return ipltds.findByName(name);
	}

	@Override
	public List<PLTeam> update(List<PLTeam> t) {
		return ipltds.saveAll(t);
		
	}

	@Override
	public List<?> findByRelatedNode(String nodeName, String relationName) {
		return ipltds.findByRelatedNode(nodeName, relationName);
	}

	@Override
	public PLTeam create(PLTeam t) {
		return ipltds.save(t);
	}

	@Override
	public void delete(PLTeam t) {
		ipltds.delete(t);
		
	}

	@Override
	public PLTeam update(PLTeam t) {
		return ipltds.save(t);
	}

}
