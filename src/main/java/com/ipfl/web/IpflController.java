package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipfl.data.domains.Node;

@RequestMapping("/default")
public interface IpflController <T extends Node> {
	
	@GetMapping("/")
	List<?> findAll();
	
	@GetMapping("/{id}")
	Optional<?> findById(@PathVariable Long id);
	
	
	@GetMapping
	Optional<?> findByName(@RequestParam(value="name") String name);
	
	@PostMapping("/bulk/create")
	List<T> create(@RequestBody List<T> t);
	
	@DeleteMapping("/bulk/delete")
	void delete(@RequestBody List<T> t);
	
	@PutMapping("/bulk/update")
	List<T> update(@RequestBody List<T> t);
	
	@GetMapping("/find/{nodeName}/{relationName}")
	List<?> findByRelatedNode(@PathVariable("nodeName") String nodeName, @PathVariable("relationName") String relationName);
	
	@PostMapping("/create")
	T create(@RequestBody T t);
	
	@DeleteMapping("/delete")
	void delete(@RequestBody T t);
	
	@PutMapping("/update")
	T update(@RequestBody T t);
}
