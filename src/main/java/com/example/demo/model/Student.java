package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentSex;
    private Teacher teacher;
}
