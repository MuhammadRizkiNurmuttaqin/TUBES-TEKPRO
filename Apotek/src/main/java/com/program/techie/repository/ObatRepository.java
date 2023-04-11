package com.program.techie.repository;

import com.program.techie.model.Obat;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ObatRepository extends MongoRepository<Obat, String>{
	@Query("{'name': ?0")
	Optional<Obat> findByName(String name);
}
