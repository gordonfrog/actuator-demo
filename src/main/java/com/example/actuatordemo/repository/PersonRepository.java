package com.example.actuatordemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.actuatordemo.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

	public List<Person> findByPesel(String pesel);
	
}
