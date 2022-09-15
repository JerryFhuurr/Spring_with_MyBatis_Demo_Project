package com.example.demo.mapper;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getStudents(Teacher teacher);
    Teacher getATeacherById(Teacher teacher);
    List<Teacher> getTeachers();
    int addStudent(List<Student> students);
    List<Student> getStudentsAll();
}
