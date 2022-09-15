package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface StudentService {
    @Transactional
    List<Student> getStudents(Teacher teacher);

    @Transactional
    Teacher getATeacherById(Teacher teacher);
}
