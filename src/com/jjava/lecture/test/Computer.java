package com.jjava.lecture.test;

public class Computer extends Calculator {
		
		


	@Override
	public double areaCircle(int param) {
		// TODO Auto-generated method stub
		return super.areaCircle(param);
	}

	@Override
	public double areaCircle2(int param) {
		// TODO Auto-generated method stub
		return super.areaCircle2(param);
	}

	public static void main(String[] args) {
		
	int param = 7;
	
	Calculator calculator = new Calculator();
	
	System.out.println("원의 반지름 : " + param);
	System.out.println("원 면적 : " + calculator.areaCircle(param));
	
	Computer computer = new Computer();
	
	System.out.println("원 면적 : " + computer.areaCircle2(param));
	}
}
