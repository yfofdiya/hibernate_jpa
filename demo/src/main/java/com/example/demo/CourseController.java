package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAll(){
        return List.of(new Course(1L,"Java","Yash"),
                new Course(2L,"Spring MVC","Yash"),
                new Course(3L,"Spring Boot","Yash"));
    }
}
