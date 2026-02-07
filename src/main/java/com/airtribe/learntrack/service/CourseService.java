package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();
    public void addCourse(Course course){
        courses.add(course);
    }
    public List<Course> listCourses(){
        return courses;
    }
    public Course findById(int id){
        return courses.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(()-> new EntityNotFoundException("Course not found"));

    }
}
