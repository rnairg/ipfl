package com.ipfl.web;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/default")
public interface IpflRelationshipController<R> {
	
	@PostMapping("/create")
	List<R> create (@RequestBody List<R> t);

}
