package com.ems.api.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.api.model.Student;
import com.ems.api.service.StudentService;

@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity addStudent(@RequestBody Student student) {
		Student st=studentService.addStudent(student);
		return new ResponseEntity(st,HttpStatus.CREATED);
		
	}
	@GetMapping("/student/{studentID}")
	public ResponseEntity getStudent(@PathVariable Integer studentID) {
		Student student=studentService.getStudent(studentID);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity getAllStudents() {
		List<Student> lStudents=studentService.getAllStudents();
		return new ResponseEntity(lStudents,HttpStatus.OK);
	}
	
	@PostMapping("/update/student")
	public ResponseEntity modifyStudent(@RequestBody Student student) {
		Student updateStudent=new Student();
		updateStudent=studentService.modifyStudent(student);
		return new ResponseEntity(updateStudent,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteStudent/{studentID}")
	public ResponseEntity removeStudent(@PathVariable Integer studentID) {
		String removeStudent=studentService.removeStudent(studentID);
		return new ResponseEntity(removeStudent,HttpStatus.OK);
	}
}
