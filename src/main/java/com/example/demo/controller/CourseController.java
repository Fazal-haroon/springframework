package com.example.demo.controller;

import com.example.demo.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //courses
    //Course: id, name, author
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
        new Course(1, "Learn AWS", "Fazal Tuts4u"),
        new Course(2, "Learn DevOps", "Fazal Tuts4U")
        );
    }
}
