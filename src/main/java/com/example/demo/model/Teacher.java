package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    private int teacherId;
    private String teacherName;
    private int teacherAge;
    private String teacherSex;
    private List<Student> students;
}
