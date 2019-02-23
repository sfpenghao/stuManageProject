package com.phserv.service;

import java.util.List;

import com.phserv.entity.Student;

public interface IStudentService {

	//��ȡ��������
	public List<Student> queryAll();
	
	//����idɾ��ѧ������ 
	public void deleteStudentById(int id);
	
	//��ȡ����ѧ������
	public int countAll();
	
	//����ѧ����¼
	public void saveStudent(Student stu);
	
	//����id��ȡѧ����¼
	public Student queryStudentById(int id);

	//�������ֻ�ȡѧ����¼
	public Student queryStudentByName(String name);
	
	//����ѧ����¼
	public void updateStudent1(Student stu);
}
