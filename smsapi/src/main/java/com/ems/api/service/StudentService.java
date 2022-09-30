package com.ems.api.service;

import java.util.List;

import com.ems.api.model.Student;

public interface StudentService {

	public Student addStudent(Student student);

	public Student getStudent(Integer studentId);

	public List<Student> getAllStudents();

	public Student modifyStudent(Student student);
	
	public String removeStudent(Integer studentId);
}
