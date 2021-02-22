package com.example.springbootmultipledatabse.h2.repository;

import com.example.springbootmultipledatabse.h2.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
