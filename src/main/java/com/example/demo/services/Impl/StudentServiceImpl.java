package com.example.demo.services.Impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.model.StudentInfo;
import com.example.demo.model.Teacher;
import com.example.demo.services.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper mapper;

    @Override
    public PageInfo<Student> getStudents(Teacher teacher) {
        PageHelper.startPage(2, 2);
        List<Student> students = mapper.getStudents(teacher);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return pageInfo;
    }

    @Override
    public Teacher getATeacherById(Teacher teacher) {
        return mapper.getATeacherById(teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return mapper.getTeachers();
    }

    @Override
    public int addStudent(List<Student> students) {
        return mapper.addStudent(students);
    }

    @Override
    public PageInfo<Student> getStudentsAll() {
        PageHelper.startPage(1, 5);
        List<Student> students = mapper.getStudentsAll();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return pageInfo;
    }

    @Override
    public int deleteStudent(List<Student> students) {
        return mapper.deleteStudent(students);
    }

    @Override
    public StudentInfo getStudentWithTeacherBySId(Student student) {
        return mapper.getStudentWithTeacherBySId(student);
    }

    @Override
    public int updateStudent(List<Student> students) {
        return mapper.updateStudent(students);
    }

    @Override
    public int insertIntoAge15() {
        return mapper.insertIntoAge15();
    }

    @Override
    public int insertIntoAge16() {
        return mapper.insertIntoAge16();
    }
}
