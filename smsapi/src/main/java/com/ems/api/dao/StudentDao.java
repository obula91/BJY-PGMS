package com.ems.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.api.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
