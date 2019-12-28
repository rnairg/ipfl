package com.ipfl.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/default")
public interface IpflController <T> {
	
	@GetMapping("/")
	List<T> findAll();
	
	@GetMapping("/{id}")
	Optional<T> findById(@PathVariable int id);
	
	@PostMapping("/create")
	List<T> create(@RequestBody List<T> t);
	
	@DeleteMapping("/delete")
	void delete(@RequestBody List<T> t);
}
