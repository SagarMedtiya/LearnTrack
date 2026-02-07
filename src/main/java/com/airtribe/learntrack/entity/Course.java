package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.CourseStatus;
import lombok.Data;

@Data
public class Course {
    private int id;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private CourseStatus status;

    public Course(int id, String courseName, String description, int durationInWeeks){
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.status = CourseStatus.ACTIVE;
    }
    public boolean isActive(){
        return status == CourseStatus.ACTIVE;
    }
}
