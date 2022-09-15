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
}
