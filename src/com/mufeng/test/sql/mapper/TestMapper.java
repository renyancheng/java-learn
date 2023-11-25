package com.mufeng.test.sql.mapper;

import com.mufeng.test.sql.entity.Student;
import com.mufeng.test.sql.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cache.decorators.FifoCache;

import java.util.List;

// 设置缓存
@CacheNamespace(eviction = FifoCache.class, size = 512, flushInterval = 60000, readWrite = false)
public interface TestMapper {
    @Insert("INSERT INTO student(name, sex) values (#{name},#{sex})")
    int addStudent(Student student);

    // 设置二级缓存刷新
    @Options(flushCache = Options.FlushCachePolicy.FALSE)
    @Results({
            @Result(column = "sid", property = "sid"),
            @Result(column = "name", property = "name"),
            @Result(column = "sex", property = "sex"),
            @Result(column = "sid", property = "teacherList", many = @Many(select = "getTeacherBySid"))
    })
    @Select("select * from student where sid = #{sid}")
    Student getStudentBySid(int sid);

    @Results({
            @Result(column = "tid", property = "tid"),
            @Result(column = "name", property = "name"),
            @Result(column = "tid", property = "studentList", many = @Many(select = "getStudentByTid"))
    })
    @Select("select * from teacher where tid = #{tid}")
    Teacher getTeacherByTid(int tid);

    @Select("select * from student inner join teach on student.sid = teach.sid where tid = #{tid}")
    List<Student> getStudentByTid(int tid);

    @Select("select * from teacher inner join teach on teacher.tid = teach.tid where sid = #{sid}")
    List<Teacher> getTeacherBySid(int sid);

}
