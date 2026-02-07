package com.airtribe.learntrack.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Enrollment {
    private int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private String status;

    public Enrollment(int id, int studentId, int courseId){
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = LocalDate.now();
        this.status = "ACTIVE";
    }
}
