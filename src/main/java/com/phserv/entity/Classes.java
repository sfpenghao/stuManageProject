package com.phserv.entity;

public class Classes {
	private int id;
	
	private String class_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", class_name=" + class_name + "]";
	}
	
	
}
