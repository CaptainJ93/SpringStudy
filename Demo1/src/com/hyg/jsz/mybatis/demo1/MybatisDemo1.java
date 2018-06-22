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
//		// mybatis�����ļ�
//		String resource = "SqlMapConfig.xml";
//
//		// ��������ļ��е���Ϣ������������
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//
//		// ����sessionfactory,����mybatis������Ϣ
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//		// ʹ�����õ�SQLSession
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		// ͨ��SQLSession�������ݿ� ��һ��������statement��id���ڶ��������Ƕ�Ӧ���͵Ĳ�����ֵ
//		Student student = sqlSession.selectOne("Student.findStudentById", 108);
//
//		System.out.println(student);
//
//		// �ͷ���Դ
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
		student.setSsex("��");
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
		student.setSsex("Ů");
		student.setSclass("95036");
		
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Student.updateStudentBySno", student);
		
		
	}
	
}
