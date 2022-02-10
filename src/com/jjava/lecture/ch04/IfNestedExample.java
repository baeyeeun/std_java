package com.jjava.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
	
		int score = 98;
		String grade ="";
		String hakjam="";
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";

		}
		System.out.println("학점은 :" + grade + "입니다.");
		System.out.println("학점은 :" + hakjam + "입니다.");
	}
	}
}
