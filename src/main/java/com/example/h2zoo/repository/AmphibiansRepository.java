package com.example.h2zoo.repository;

import com.example.h2zoo.model.amphibians;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmphibiansRepository extends CrudRepository<amphibians, Long> {
}
