package com.phserv.entity;

public class Student {
	private int id;
	
	private String name;
	
	private String pwd;
	
	private String stunum;
	
	private String imgUrl;
	
	private Classes classes;
	
	private Boolean sex;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getStunum() {
		return stunum;
	}

	public void setStunum(String stunum) {
		this.stunum = stunum;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pwd=" + pwd + ", stuNum=" + stunum + ", imgUrl=" + imgUrl
				+ ", classes=" + classes + ", sex=" + sex + "]";
	}
	
	
}
