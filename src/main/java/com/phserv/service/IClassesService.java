package com.phserv.service;

import java.util.List;

import com.phserv.entity.Classes;
import com.phserv.entity.ClassesChart;

public interface IClassesService {

	
	//��ȡ���а༶
	public List<Classes> queryAllClasses();
	
	//��ȡ�༶����
	public List<ClassesChart> queryChart();
}
