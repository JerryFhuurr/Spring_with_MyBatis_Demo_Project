package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.model.StudentInfo;
import com.example.demo.model.Teacher;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface StudentService {
    @Transactional
    PageInfo<Student> getStudents(Teacher teacher);

    @Transactional
    Teacher getATeacherById(Teacher teacher);

    @Transactional
    List<Teacher> getTeachers();

    @Transactional
    int addStudent(List<Student> students);

    @Transactional
    PageInfo<Student> getStudentsAll();

    @Transactional
    int deleteStudent(List<Student> students);

    @Transactional
    StudentInfo getStudentWithTeacherBySId(Student student);

    @Transactional
    int updateStudent(List<Student> students);

    @Transactional
    int insertIntoAge15();

    @Transactional
    int insertIntoAge16();

    @Transactional
    int addStudentByAge(List<Student> students);
}
