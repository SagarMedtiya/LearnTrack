package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> listStudents(){
        return students;
    }
    public Student findById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(()-> new EntityNotFoundException("Student not found"));
    }
    public void deactivateStudent(int id) {
        Student student = findById(id);
        student.setActive(false);
    }
}
