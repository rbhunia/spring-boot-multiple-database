package com.example.springbootmultipledatabase.postgres.repository;

import com.example.springbootmultipledatabase.postgres.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
