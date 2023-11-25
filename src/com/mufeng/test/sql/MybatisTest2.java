package com.mufeng.test.sql;

import com.mufeng.test.sql.entity.Student;
import com.mufeng.test.sql.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MybatisTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
//        System.out.println(mapper.addStudent(new Student().setName("李华").setSex("M")));
//        System.out.println(mapper.getStudentBySid(53));
//        System.out.println(mapper.getTeacherByTid(18));
        System.out.println(mapper.getStudentBySid(1));
    }
}
