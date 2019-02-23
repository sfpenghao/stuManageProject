package com.phserv.service;

import java.util.List;

import com.phserv.entity.Student;

public interface IStudentService {

	//获取所有数据
	public List<Student> queryAll();
	
	//按照id删除学生数据 
	public void deleteStudentById(int id);
	
	//获取所有学生人数
	public int countAll();
	
	//增加学生记录
	public void saveStudent(Student stu);
	
	//根据id获取学生记录
	public Student queryStudentById(int id);

	//根据名字获取学生记录
	public Student queryStudentByName(String name);
	
	//更改学生记录
	public void updateStudent1(Student stu);
}
