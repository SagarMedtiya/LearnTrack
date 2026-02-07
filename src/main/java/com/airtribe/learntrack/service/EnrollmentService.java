package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();
    public void enroll(Enrollment enrollment) {
        enrollments.add(enrollment);
    }
    public List<Enrollment> getByStudentId(int studentId) {
        List<Enrollment> result = new ArrayList<>();
        for(Enrollment e: enrollments) {
            if(e.getStudentId() == studentId){
                result.add(e);
            }
        }
        return result;
    }
}
