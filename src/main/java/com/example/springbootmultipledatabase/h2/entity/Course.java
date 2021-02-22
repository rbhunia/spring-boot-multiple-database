package com.example.springbootmultipledatabase.h2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Course {

    public Course(Course course) {
        this.id = course.getId();
        this.name = course.getName();
    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
