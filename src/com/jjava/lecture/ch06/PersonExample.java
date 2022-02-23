package com.jjava.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {
	
		
	Person person = new Person("12345-678910");
	
	System.out.println(person.nation);
	System.out.println(person.ssn);

	person.name="ภฬน้มฆ";
	
	System.out.println(person.name);


	
	}

}
