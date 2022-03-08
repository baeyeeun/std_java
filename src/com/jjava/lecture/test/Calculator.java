package com.jjava.lecture.test;

public class Calculator extends Constants {

	
	public double areaCircle(int param) {
		
		System.out.println("Calculator 객체의 원 면적 구하는 프로그램 실행");
		
		return PAI_1 * param * param;
	}
	
	public double areaCircle2(int param) {

		System.out.println("Computer 객체의 원 면적 구하는 프로그램 실행");
		
		return PAI_2 * param * param;
	}
}
