package com.mufeng.test.sql.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int tid;
    private String name;
    private List<Student> studentList;
}
