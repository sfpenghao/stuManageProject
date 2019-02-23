package com.phserv.service;

import java.util.List;

import com.phserv.entity.Classes;
import com.phserv.entity.ClassesChart;

public interface IClassesService {

	
	//获取所有班级
	public List<Classes> queryAllClasses();
	
	//获取班级报表
	public List<ClassesChart> queryChart();
}
