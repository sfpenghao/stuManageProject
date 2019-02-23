package com.phserv.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.phserv.entity.Student;
import com.phserv.mapper.StudentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMyBatis {
	@Autowired
	private StudentMapper mapper;
	
	@Test
	public void test() {
		List<Student> list = mapper.queryAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
}
