package com.ems.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.api.model.Employee;
import com.ems.api.repository.EmployeeDao;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public Employee getEmployee(int empId) {
		Employee emp = new Employee();
		try {
			emp = convertToEmployee(empDao.findById(empId));
		} catch (Exception e) {
			System.out.println("exception while getting employee");
		}
		return emp;
	}
	
	private Employee convertToEmployee(Optional<com.ems.api.entity.Employee> optional) {
		Employee employee = new Employee();
		if (optional != null) {
			employee.setEmpId(optional.get().getEmpId());
			employee.setEmpName(optional.get().getEmpName());
		}
		return employee;
	}
	
	

}
