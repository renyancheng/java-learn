package com.mufeng.test.sql;

import com.mufeng.test.sql.entity.Student;
import com.mufeng.test.sql.entity.Teacher;
import com.mufeng.test.sql.mapper.StudentMapper;
import com.mufeng.test.sql.mapper.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class MybatisTest {
    public static void main(String[] args) throws FileNotFoundException {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
//        List<Student> students = sqlSession.selectList("selectStudent");
//        students.forEach(System.out::println);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        System.out.println(mapper.getClass());
//        mapper.selectStudent().forEach(System.out::println);
        /*Scanner sc = new Scanner(System.in);
        int sid = sc.nextInt();
        String name = sc.next();
        String sex = sc.next();
        Student student = new Student(sid, name, sex);
        int i = mapper.addStudent(student);
        if (i > 0) {
            System.out.println("插入成功"+ i+"行");
        }
        */
        /*TeacherMapper tMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher= tMapper.getTeacherByTid(117);
        teacher.forEach(System.out::println);
*/
//        System.out.println(mapper.getStudentBySid(1));
//        mapper.addStudent(new Student().setName("RenYancheng").setSex("M"));
//        System.out.println(mapper.deleteStudent(52));
//        System.out.println(mapper.updateStudent(new Student().setSex("M").setName("刀哥").setSid(51)));
    }
}
