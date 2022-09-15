package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @RequestMapping("/student/getAllB/test")
    public List<Student> getStudents(Teacher teacher) {
        return service.getStudents(teacher);
    }

    @RequestMapping("/teacher/get/contain/students")
    public String getATeacherById(Teacher teacher) {
        Teacher teacherGet = service.getATeacherById(teacher);
        if (teacherGet != null) {
            if (teacherGet.getStudents().size() != 0) {
                return "Teacher found !" + teacherGet.toString();
            } else {
                return "Teacher get success ! And no student found for this teacher";
            }
        } else {
            return "No matched teacher found.";
        }
    }

    @RequestMapping("/teacher/getAll")
    public String getTeachers() {
        List<Teacher> teachers = service.getTeachers();
        if (teachers.size() >= 1) {
            return teachers.toString();
        } else return "No teacher in the table!";
    }

    public List<Teacher> getTeachersList() {
        return service.getTeachers();
    }

    @RequestMapping("/student/add")
    public String addStudents(List<Student> students) {
        int teachersSize = getTeachersList().size();
        int errorCount = 0;
        for (var student :
                students) {
            if (student.getTeacher().getTeacherId() > teachersSize) {
                errorCount++;
                return student.getStudentId() + " has wrong teacher id !";
            }
        }
        int r = service.addStudent(students);
        if (r >= 1 && errorCount == 0) {
            return r + " student(s) added";
        } else return "Student added failed";
    }

    @RequestMapping("/student/getAll/string")
    public String getStudentsString() {
        List<Student> students = service.getStudentsAll();
        if (students.size() >= 1) {
            return students.toString();
        } else return "No student in the table!";
    }

    @RequestMapping("/student/getAll/json")
    public List<Student> getStudentsJson() {
        List<Student> students = service.getStudentsAll();
        return students;
    }
}
