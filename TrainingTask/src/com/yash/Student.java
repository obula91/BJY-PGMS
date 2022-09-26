package com.yash;

import java.time.LocalDateTime;


public	class Student{
	Integer rollno;
	LocalDateTime date_of_addmission,dob;
	String maths, physics, chemistry, English, hindi; // marks in subjects
	String classname;
	public Student(Integer rollno, LocalDateTime date_of_addmission, LocalDateTime dob, String maths, String physics,
			String chemistry, String english, String hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}
	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getPhysics() {
		return physics;
	}
	public void setPhysics(String physics) {
		this.physics = physics;
	}
	public String getChemistry() {
		return chemistry;
	}
	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}
	public String getEnglish() {
		return English;
	}
	public void setEnglish(String english) {
		English = english;
	}
	public String getHindi() {
		return hindi;
	}
	public void setHindi(String hindi) {
		this.hindi = hindi;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English=" + English + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}
	
	
	
	}
	
	


