package com.ipfl.services;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipfl.data.domains.PlayerStats;

@Service
public class PointService {
	
	private final KieContainer kieContainer;
	
	@Autowired
	public PointService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	public PlayerStats calculatePoints(PlayerStats ps) {
		
		System.out.println("In Points Calculation");
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(ps);
		kieSession.fireAllRules();
		kieSession.dispose();
		System.out.println("Points: " + ps.getPoints());
		return ps;
	}

}
