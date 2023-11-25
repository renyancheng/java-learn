package com.mufeng.test.sql.mapper;

import com.mufeng.test.sql.entity.Student;
import com.mufeng.test.sql.entity.Teacher;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudent();

    Student getStudentBySid(int sid);

    int addStudent(Student student);

    int deleteStudent(int sid);

    int updateStudent(Student student);
}
