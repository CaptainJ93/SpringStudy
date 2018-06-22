package com.hyg.jsz.mybatis.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hyg.jsz.mybatis.pojo.Student;

public class MybatisDemo1 {

	public static void main(String[] args) throws IOException {
//		// mybatis配置文件
//		String resource = "SqlMapConfig.xml";
//
//		// 获得配置文件中的信息，以输出流输出
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//
//		// 创建sessionfactory,传入mybatis配置信息
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//		// 使工厂得到SQLSession
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		// 通过SQLSession操作数据库 第一个参数是statement的id，第二个参数是对应类型的参数的值
//		Student student = sqlSession.selectOne("Student.findStudentById", 108);
//
//		System.out.println(student);
//
//		// 释放资源
//		sqlSession.close();
		MybatisDemo1 mybatisDemo1 = new MybatisDemo1();
		mybatisDemo1.UpdateStudent();
	}

	public void findUserByName() throws IOException {
		String sqlMapConfig = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(sqlMapConfig);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		List<Student> studentList = sqlSession.selectList("Student.findStudentByName", "d");
		
		System.out.println(studentList);
		
		sqlSession.close();
	}
	
	public void insertStudentSingle() throws IOException {
		String SqlMapConfig = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(SqlMapConfig);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Student student = new Student();
//		student.setSno(111);
		student.setSname("jiasz");
		student.setSsex("男");
		student.setSclass("95034");
		
		sqlSession.insert("Student.insertStudentSingle", student);
		System.out.println(student.getSno());
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void deleteStudentBySno() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.delete("Student.deleteStudentBySno", 108);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void UpdateStudent() throws IOException {
		Student student = new Student();
		student.setSno(111);
		student.setSname("wangd");
		student.setSsex("女");
		student.setSclass("95036");
		
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Student.updateStudentBySno", student);
		
		
	}
	
}
