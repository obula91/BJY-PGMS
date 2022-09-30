package com.ems.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.api.model.Employee;






public interface EmployeeService {

	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployee();
	public Employee addEmployee(Employee emp);
	public Employee modifyEmployee(Employee emp);
	public String removeEmployee(int empId);
}
