package com.yash.test;

import java.awt.dnd.DropTargetListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.yash.Student;

public class StudentTest {

	public static List<Student> getListOfStudents() {
		List<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Student(1, LocalDateTime.of(2017, 2, 13, 15, 56), LocalDateTime.of(2019, 2, 13, 15, 56),
				"18", "18", "40", "90", "80", "eight"));
		listOfStudents.add(new Student(2, LocalDateTime.of(2017, 2, 13, 15, 56), LocalDateTime.of(2019, 2, 13, 15, 56),
				"30", "35", "80", "35", "80", "five"));
		listOfStudents.add(new Student(3, LocalDateTime.of(2017, 2, 13, 15, 56), LocalDateTime.of(2019, 2, 13, 15, 56),
				"35", "35", "8", "9", "20", "six"));
		listOfStudents.add(new Student(4, LocalDateTime.of(2017, 2, 13, 15, 56), LocalDateTime.of(2019, 2, 13, 15, 56),
				"75", "75", "80", "90", "80", "four"));
		listOfStudents.add(new Student(5, LocalDateTime.of(2017, 2, 13, 15, 56), LocalDateTime.of(2019, 2, 13, 15, 56),
				"40", "35", "80", "90", "80", "seven"));
		listOfStudents.add(new Student(6, LocalDateTime.of(2017, 2, 13, 15, 56), LocalDateTime.of(2019, 2, 13, 15, 56),
				"40", "35", "08", "02", "01", "zero"));
		return listOfStudents;
	}

	public static void main(String[] args) {

		List<Student> listOfStudents = getListOfStudents();
		/**
		 * WAP to print list of all students who’s total marks are less than 40%
		 */
		System.out.println("list of all students who’s total marks are less than 40% :  ");

		listOfStudents.stream()
				.filter(n -> ((Integer.parseInt(n.getEnglish()) + Integer.parseInt(n.getHindi())
						+ Integer.parseInt(n.getMaths()) + Integer.parseInt(n.getChemistry())
						+ Integer.parseInt(n.getPhysics())) / 4) < 40)
				.collect(Collectors.toList()).forEach(n -> System.out.println(n));

		/**
		 * WAP to print list of all those students who scored more than 75% in all
		 * subjects
		 */
		System.out.println("list of all those students who scored more than 75% in all:              ");
		listOfStudents.stream()
				.filter(n -> Integer.parseInt(n.getHindi()) >= 75 && Integer.parseInt(n.getEnglish()) >= 75
						&& Integer.parseInt(n.getMaths()) >= 75 && Integer.parseInt(n.getChemistry()) >= 75
						&& Integer.parseInt(n.getPhysics()) >= 75)
				.collect(Collectors.toList()).forEach(n -> System.out.println(n));

		/**
		 * WAP to print list of all those students who scored more than 75% in any of 3
		 * subjects
		 */

		System.out.println(
				"list of all those students who scored more than 75% in any of 3\r\n" + "		 * subjects:  ");

		listOfStudents.forEach((n) -> {
			int i = 0;
			if (Integer.parseInt(n.getChemistry()) >= 75) {
				i++;

			}
			if (Integer.parseInt(n.getEnglish()) >= 75) {
				i++;
			}
			if (Integer.parseInt(n.getHindi()) >= 75) {
				i++;
			}
			if (Integer.parseInt(n.getMaths()) >= 75) {
				i++;
			}
			if (Integer.parseInt(n.getPhysics()) >= 75) {
				i++;
			}

			if (i >= 3) {
				System.out.println(n);
				i = 0;
			}
		});

		/**
		 * . WAP to print list of all those students who scored more than 75% in all
		 * subjects.
		 */

		System.out.println(
				"list of all those students who scored more than 75% in all\r\n" + "		 * subjects :     ");

		listOfStudents.forEach((n) -> {
			int i = 0;
			if (Integer.parseInt(n.getChemistry()) >= 75) {
				i++;

			}
			if (Integer.parseInt(n.getEnglish()) >= 75) {
				i++;
			}
			if (Integer.parseInt(n.getHindi()) >= 75) {
				i++;
			}
			if (Integer.parseInt(n.getMaths()) >= 75) {
				i++;
			}
			if (Integer.parseInt(n.getPhysics()) >= 75) {
				i++;
			}

			if (i >= 5) {
				System.out.println(n);
				i = 0;
			}
		});

		/**
		 * WAP to find those students who are fail in at least one subject
		 */

		System.out.println(
				"students who are fail in at least one subject :          ******************************                 :");

		listOfStudents.forEach((n) -> {
			int i = 0;
			if (Integer.parseInt(n.getChemistry()) <= 39) {
				i++;

			}
			if (Integer.parseInt(n.getEnglish()) <= 39) {
				i++;
			}
			if (Integer.parseInt(n.getHindi()) <= 39) {
				i++;
			}
			if (Integer.parseInt(n.getMaths()) <= 39) {
				i++;
			}
			if (Integer.parseInt(n.getPhysics()) <= 39) {
				i++;
			}

			if (i >= 1) {
				System.out.println(n);
				i = 0;
			}
		});

		/**
		 * Find how many students are promoted to another class.
		 * 
		 */

		System.out.println(
				"students are promoted to another class :          ******************************                 :");

		listOfStudents.forEach((n) -> {
			int i = 0;
			if (Integer.parseInt(n.getChemistry()) >= 40) {
				i++;

			}
			if (Integer.parseInt(n.getEnglish()) >= 40) {
				i++;
			}
			if (Integer.parseInt(n.getHindi()) >= 40) {
				i++;
			}
			if (Integer.parseInt(n.getMaths()) >= 40) {
				i++;
			}
			if (Integer.parseInt(n.getPhysics()) >= 40) {
				i++;
			}

			if (i == 5) {
				System.out.println(n);
				i = 0;
			}
		});

		/**
		 * Find how many students need to give exam in two subjects to promoted to
		 * another class
		 */
		System.out.println(
				"students need to give exam in two subjects to promoted to\r\n"
				+ "		 * another class :          ******************************                 :");

		listOfStudents.forEach((n) -> {
			int i = 0;
			if (Integer.parseInt(n.getChemistry()) < 40) {
				i++;

			}
			if (Integer.parseInt(n.getEnglish()) < 40) {
				i++;
			}
			if (Integer.parseInt(n.getHindi()) < 40) {
				i++;
			}
			if (Integer.parseInt(n.getMaths()) < 40) {
				i++;
			}
			if (Integer.parseInt(n.getPhysics()) < 40) {
				i++;
			}

			if (i == 2) {
				System.out.println(n);
				i = 0;
			}
		});


	}
}
