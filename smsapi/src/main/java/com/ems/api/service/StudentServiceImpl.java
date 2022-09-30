package com.ems.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.api.dao.StudentDao;
import com.ems.api.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	@Override
	public Student addStudent(Student student) {
		Student saveStudent=new Student();
		try {
			saveStudent=studentDao.save(student);
		}catch(Exception ex) {
			System.out.println("addStudent():: "+ex.getMessage());
		}
		return saveStudent;
	}
	
	public Student convetToStudent(Optional<Student> student) {
		Student st=new Student();
		if(student !=null) {
			st.setStudentId(student.get().getStudentId());
			st.setStudentName(student.get().getStudentName());
			st.setStudentBranch(student.get().getStudentBranch());
			st.setStudentFee(student.get().getStudentFee());
		}
		return st;
	}

	@Override
	public Student getStudent(Integer studentId) {
		Student st=new Student();
		try {
			st=convetToStudent(studentDao.findById(studentId));
		}catch(Exception ex) {
			System.out.println("getStudent ::"+ex.getMessage());
		}
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students=new ArrayList<>();
		try {
			students=studentDao.findAll();
		}catch(Exception ex) {
			System.out.println("getStudents():: "+ex.getMessage());
		}
		return students;
	}
	
	@Override
	public Student modifyStudent(Student student) {
		Student modStudent=new Student();
		try {
			modStudent=getStudent(student.getStudentId());
			if(modStudent!=null) {
				modStudent.setStudentName(student.getStudentName());
			modStudent=studentDao.save(student);
			}
		}catch (Exception ex) {
			System.out.println("modifyStudent()::"+ex.getMessage());
		}
		return modStudent;
	}

	@Override
	public String removeStudent(Integer studentId) {
		Student student=new Student();
		boolean flag=false;
		try {
			student=getStudent(studentId);
			if(student!=null) {
				studentDao.deleteById(studentId);
				flag=true;
			}
		}catch(Exception ex) {
			System.out.println("removeStudent()::"+ex.getMessage());
		}
		if (flag) {
			return "student has deleted Successfully with id= " + studentId;
		} else {
			return "id " + studentId + " does not exist";
		}
		
	}
	
	

	
}
