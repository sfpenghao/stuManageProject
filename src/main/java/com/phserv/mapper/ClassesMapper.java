package com.phserv.mapper;

import java.util.List;

import com.phserv.entity.Classes;
import com.phserv.entity.ClassesChart;

public interface ClassesMapper {

	
	//��ȡ���а༶
	public List<Classes> queryAllClasses();
	
	//��ȡ�༶����
	public List<ClassesChart> queryChart();
}
