package com.ems.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.api.entity.Employee;



@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
