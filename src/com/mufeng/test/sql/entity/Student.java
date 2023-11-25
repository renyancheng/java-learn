package com.mufeng.test.sql.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;


@Data
@Accessors(chain = true)
public class Student {
    private Integer sid;
    private String name;
    private String sex;
    private List<Teacher> teacherList;
}
