package com.jjava.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {
	
		Student student = new Student("beckje", "1234-1234", 21);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		//		Student student2 = new Student("beckje", "1234-1234", 19);
		
		//System.out.println(student2.name);
		//System.out.println(student2.ssn);
		//System.out.println(student2.studentNo);

	}

}
