package com.example.springbootmultipledatabse.postgres.repository;

import com.example.springbootmultipledatabse.postgres.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
