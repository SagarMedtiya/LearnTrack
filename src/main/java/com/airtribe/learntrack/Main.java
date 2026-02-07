package com.airtribe.learntrack;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. Enroll Student");
            System.out.println("0. Exit");

            try{
                int choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1 ->{
                        int id = IdGenerator.nextStudentId();
                        System.out.println("First Name: ");
                        String fn = sc.nextLine();
                        System.out.println("Last Name: ");
                        String ln = sc.nextLine();
                        System.out.println("Batch: ");
                        String batch = sc.nextLine();

                        studentService.addStudent(new Student(id, fn, ln, batch));
                        System.out.println("Student added with ID" + id);
                    }
                    case 2 -> studentService.listStudents()
                            .forEach(s -> System.out.println(
                                    s.getId() + " | " + s.getDisplayName()
                            ));
                    case 3 -> {
                        int id = IdGenerator.nextCourseId();
                        System.out.println("Course Name: ");
                        String name = sc.nextLine();
                        System.out.println("Duration: ");
                        int duration = Integer.parseInt(sc.nextLine());
                        courseService.addCourse(new Course(id, name, "", duration));
                        System.out.println("Courses added");

                    }
                    case 4 ->{
                        try {
                            System.out.println("Student ID: ");
                            int sid = Integer.parseInt(sc.nextLine());
                            System.out.println("Course ID: ");
                            int cid = Integer.parseInt(sc.nextLine());

                            Student student = studentService.findById(sid);

                            Course course = courseService.findById(cid);

                            if (!student.isActive()) {
                                System.out.println("Please add Student");
                                break;
                            }
                            if (!course.isActive()) {
                                System.out.println("Please add Course");
                                break;
                            }
                            enrollmentService.enroll(new Enrollment(
                                    IdGenerator.nextEnrollmentId(),
                                    sid, cid
                            ));
                            System.out.println("Enrollments added");
                        }
                        catch(EntityNotFoundException e){
                            System.out.println(e.getMessage());
                        }
                        catch(NumberFormatException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    case 0 -> System.exit(0);
                    default -> throw new InvalidInputException("Invalid menu choice");
                }
            }catch(Exception e){
                System.out.println("Error:" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}