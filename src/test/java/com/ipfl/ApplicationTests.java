package com.ipfl;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ipfl.data.domains.Person;
import com.ipfl.data.domains.Player;
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
		Person p = op.get();
		System.out.println("Name is: "+ p.getName());
		
	}
	@Test
	void testFindAll() {
		
		ipds.findAll();
	}

}
