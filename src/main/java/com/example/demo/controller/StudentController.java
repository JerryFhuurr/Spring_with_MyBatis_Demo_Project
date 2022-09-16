package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.StudentInfo;
import com.example.demo.model.Teacher;
import com.example.demo.services.StudentService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @RequestMapping("/student/getAllB/test")
    public PageInfo<Student> getStudents(Teacher teacher) {
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

    @RequestMapping("/teacher/getAll/string")
    public String getTeachersString() {
        List<Teacher> teachers = service.getTeachers();
        if (teachers.size() >= 1) {
            return teachers.toString();
        } else return "No teacher in the table!";
    }

    @RequestMapping("/teacher/getAll/json")
    public List<Teacher> getTeachersJson() {
        return service.getTeachers();
    }

    @RequestMapping("/student/add")
    public String addStudents(@RequestBody List<Student> students) {
        int r = service.addStudent(students);
        if (r >= 1) {
            return r + " student(s) added";
        } else return "Student added failed";
    }

    @RequestMapping("/student/getAll/string")
    public String getStudentsString() {
        PageInfo<Student> students = service.getStudentsAll();
        if (students != null) {
            return students.toString();
        } else return "No student in the table!";
    }

    @RequestMapping("/student/getAll/json")
    public PageInfo<Student> getStudentsJson() {
        return service.getStudentsAll();
    }

    @RequestMapping("/student/delete")
    public String deleteStudent(@RequestBody List<Student> students) {
        int r = service.deleteStudent(students);
        if (r != 0) {
            return students.size() + " student(s) deleted !";
        } else {
            return "Student delete failed !";
        }
    }

    @RequestMapping("/student/get/withTeacher/id")
    public StudentInfo getStudentWithTeacherBySId(Student student) {
        return service.getStudentWithTeacherBySId(student);
    }

    @RequestMapping("/student/update/id")
    public String updateStudent(@RequestBody List<Student> students) {
        int r = service.updateStudent(students);
        if (r != 0) {
            return students.size() + " student(s) updated !";
        } else {
            return "Student update failed !";
        }
    }

    @RequestMapping("/student/select/age15")
    public String insertIntoAge15() {
        int r = service.insertIntoAge15();
        if (r >= 1) {
            return "Data copy done! (age <= 15)";
        } else {
            return "Data copy failed! (age <= 15)";
        }
    }

    @RequestMapping("/student/select/age16")
    public String insertIntoAge16() {
        int r = service.insertIntoAge16();
        if (r >= 1) {
            return "Data copy done! (age > 16)";
        } else {
            return "Data copy failed! (age > 16)";
        }
    }
}
