package com.phserv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phserv.entity.Classes;
import com.phserv.entity.ClassesChart;
import com.phserv.mapper.ClassesMapper;

@Service("classes")
public class ClassesServiceImpl implements IClassesService{

	@Autowired
	private ClassesMapper mapper;

	@Override
	public List<Classes> queryAllClasses() {
		// TODO Auto-generated method stub
		return mapper.queryAllClasses();
	}

	@Override
	public List<ClassesChart> queryChart() {
		// TODO Auto-generated method stub
		return mapper.queryChart();
	}
	
}
