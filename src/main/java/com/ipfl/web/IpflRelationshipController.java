package com.ipfl.web;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ipfl.data.domains.Relationship;

@RequestMapping("/default")
public interface IpflRelationshipController<R extends Relationship<?, ?>> {
	
	@PostMapping("/bulk/create")
	List<R> create (@RequestBody List<R> t);
	
	@PostMapping("/bulk/create/byNodes")
	List<R> createByNodeNames (@RequestBody List<R> t);

}
