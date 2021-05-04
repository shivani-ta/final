package com.Tangellapallyclasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Tangellapallyclasses.DMS.Models.Dog;



public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	//findByName
	
	List<Dog> findByName(String name);

}
