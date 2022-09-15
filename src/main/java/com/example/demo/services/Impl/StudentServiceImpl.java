package com.example.demo.services.Impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper mapper;
    @Override
    public List<Student> getStudents(Teacher teacher) {
        return mapper.getStudents(teacher);
    }
}
