package com.phserv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phserv.entity.Student;
import com.phserv.mapper.StudentMapper;

@Service("student")
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentMapper mapper;
	
	@Override
	public List<Student> queryAll() {
		// TODO Auto-generated method stub
		return mapper.queryAll();
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		mapper.deleteStudentById(id);
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return mapper.countAll();
	}

	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		mapper.saveStudent(stu);
	}

	@Override
	public Student queryStudentById(int id) {
		// TODO Auto-generated method stub
		return mapper.queryStudentById(id);
	}
	
	@Override
	public Student queryStudentByName(String name) {
		// TODO Auto-generated method stub
		return mapper.queryStudentByName(name);
	}

	@Override
	public void updateStudent1(Student stu) {
		// TODO Auto-generated method stub
		mapper.updateStudent1(stu);
	}
	
	
}