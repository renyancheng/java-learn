package com.mufeng.test.sql;

import com.mufeng.test.sql.entity.Student;
import com.mufeng.test.sql.mapper.TestMapper;
import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.LogManager;

@Log
public class MybatisTest2 {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        LogManager manager = LogManager.getLogManager();
        manager.readConfiguration(new FileInputStream("test.properties"));
//        System.out.println(mapper.addStudent(new Student().setName("李华").setSex("M")));
//        System.out.println(mapper.getStudentBySid(53));
//        System.out.println(mapper.getTeacherByTid(18));
//        System.out.println(mapper.getStudentBySid(1));
        log.info(mapper.getStudentBySid(1).toString());
    }
}
