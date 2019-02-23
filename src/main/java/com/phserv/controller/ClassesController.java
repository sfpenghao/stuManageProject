package com.phserv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phserv.entity.ClassesChart;
import com.phserv.service.IClassesService;

@Controller
@RequestMapping("classes")
public class ClassesController {
	

	@Autowired
	@Qualifier("classes")
	private IClassesService clsServ;
	
	@RequestMapping("index")
	public String queryClassesChart(Model m) {
		List<ClassesChart> chartList = clsServ.queryChart();
		m.addAttribute("chartList", chartList);
		return "classes/chart";
	}
	
}
