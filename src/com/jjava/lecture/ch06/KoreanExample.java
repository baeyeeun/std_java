package com.jjava.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {
	
	Korean korean = new Korean();
	
	System.out.println("korean.nation : " + korean.nation);
	System.out.println("korean.nation : " + korean.name);
	System.out.println("korean.nation : " + korean.ssn);
	
	korean.name = "고구려";
	korean.ssn = "123412341234";
	
	System.out.println("----------------------------");
	System.out.println("korean.nation : " + korean.nation);
	System.out.println("korean.nation : " + korean.name);
	System.out.println("korean.nation : " + korean.ssn);
	
	Korean korean2 = new Korean("이백제", "123412341234");
	
	System.out.println("----------------------------");
	System.out.println("korean.nation : " + korean2.nation);
	System.out.println("korean.nation : " + korean2.name);
	System.out.println("korean.nation : " + korean2.ssn);
	
	Korean korean3 = new Korean("이신라","123456789");
	
	System.out.println("----------------------------");
	System.out.println("korean.nation : " + korean3.nation);
	System.out.println("korean.nation : " + korean3.name);
	System.out.println("korean.nation : " + korean3.ssn);

	}

}
