package com.example.springbootmultipledatabse.resource;

import com.example.springbootmultipledatabse.exception.ResourceNotFoundException;
import com.example.springbootmultipledatabse.h2.entity.Course;
import com.example.springbootmultipledatabse.h2.repository.CourseRepository;
import com.example.springbootmultipledatabse.postgres.entity.Person;
import com.example.springbootmultipledatabse.postgres.repository.PersonRepository;
import com.example.springbootmultipledatabse.vo.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonCourseResource {

    private CourseRepository courseRepository;
    private PersonRepository personRepository;

    @GetMapping("/api/test")
    ResponseEntity<Response> test() {
        return ResponseEntity.ok(new Response("Hello world"));
    }

    @GetMapping("/api/person/{person}/course/{course}")
    ResponseEntity<Response> get(@PathVariable("person") Long personId, @PathVariable("course") Long courseId) {
        Person person = personRepository
                .findById(personId)
                .map(Person::new)
                .orElseThrow(() -> new ResourceNotFoundException("No such person"));

        Course course = courseRepository
                .findById(courseId)
                .map(Course::new)
                .orElseThrow(() -> new ResourceNotFoundException("No such course"));
        return ResponseEntity.ok(new Response(person.getName() + " enrolled to " + course.getName() + " course"));
    }
}
