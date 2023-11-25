package com.mufeng.test.sql.mapper;

import com.mufeng.test.sql.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacherByTid(int tid);
}
