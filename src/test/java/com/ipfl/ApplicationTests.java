package com.ipfl;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ipfl.data.domains.Player;
import com.ipfl.data.dto.PlayerDTO;
import com.ipfl.services.IpflPlayerDataService;


@SpringBootTest
class ApplicationTests {
	
	@Autowired
	IpflPlayerDataService ipds;

	@Test
	void testCreate() {
		
		//Player p = new Player("Test Player","Indian");
		//p.setName("Test Player");
		//p.setNationality("Indian");
		
		//ipds.create(p);
	}
	@Test
	void testFindById() {
		
		Optional<Player> op = ipds.findById(0);
		//PlayerSummary p = op.get();
		System.out.println("Name is: "+ op.get().getName());
		
	}
	@Test
	void testFindAll() {
		
		ipds.findAll();
	}

}
