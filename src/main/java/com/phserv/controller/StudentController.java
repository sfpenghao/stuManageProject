package com.phserv.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.phserv.entity.Classes;
import com.phserv.entity.Student;
import com.phserv.service.IClassesService;
import com.phserv.service.IStudentService;
import com.phserv.util.FileUtil;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	@Qualifier("student")
	private IStudentService stuServ;
	@Autowired
	@Qualifier("classes")
	private IClassesService clsServ;
	
	@RequestMapping("index")
	public String index(Model mod) {
		List<Student> stuLists = stuServ.queryAll();
		mod.addAttribute("students", stuLists);
		return "student/student_list";
	}
	
	//删除方法
	@RequestMapping("delete")
	public String delete(@RequestParam("id") Integer id) {
		stuServ.deleteStudentById(id);
		return "redirect:/student/index";
	}
	
	//跳转方法
	@RequestMapping("add")
	public String add(Model m) {
		Student stu = new Student();
		stu.setId(-1);
		List<Classes> classes = clsServ.queryAllClasses();
		m.addAttribute("stu", stu);
		m.addAttribute("classes", classes);
		return "student/student_input";
	}
	
	//保存方法
	@RequestMapping("save")
	public String save(Student stu, @RequestParam("imgFile") MultipartFile imgFile, @RequestParam("classes.id") Integer id, HttpServletRequest req ,Model m) throws IOException {
		//完成上传功能
		String path = null;
		String imgUrl = null;
		Classes cls = new Classes();
		cls.setId(id);
		stu.setClasses(cls);
		if(imgFile != null) {
			//从eclipse启动的话要用eclipse的地址，从服务器直接启动的话用注释的写法
//			path = req.getServletContext().getRealPath("/uploadFile");
			path = "D:/MyProject/stuManageProject/WebContent/uploadFile";
			imgUrl = FileUtil.uploadImgFile(imgFile,path);
			stu.setImgUrl(imgUrl);
		}
		if(stu.getId()==-1) {
			stuServ.saveStudent(stu);
		}else {
			String ex = StringUtils.getFilenameExtension(imgFile.getOriginalFilename());
			if(null==ex) {
				Student buf = stuServ.queryStudentById(stu.getId());
				stu.setImgUrl(buf.getImgUrl());
			}
			stuServ.updateStudent1(stu);
		}
 		return "redirect:/student/index";
	}
	
	//修改跳转方法
	@RequestMapping("edit")
	public String edit(@RequestParam("id") Integer id, Model m) {
		List<Classes> classes = clsServ.queryAllClasses();
		Student stu = stuServ.queryStudentById(id);
		m.addAttribute("stu", stu);
		m.addAttribute("classes", classes);
		return "student/student_input";
	}
	
	//登录方法
	@RequestMapping("login")
	public String login(Student stu, HttpServletRequest req) {
		Student buf = stuServ.queryStudentByName(stu.getName());
		if(buf.getPwd().equals(stu.getPwd())) {
			HttpSession hs = req.getSession();
			hs.setAttribute("currentStu", buf);
			return "redirect:/classes/index";
		}else {
			return "redirect:/views/login.jsp";
		}
	}
}
