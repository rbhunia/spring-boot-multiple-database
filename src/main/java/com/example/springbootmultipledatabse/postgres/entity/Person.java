package com.example.springbootmultipledatabse.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Person {

    public Person(Person person) {
        this.id = person.getId();
        this.name = person.getName();
    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
