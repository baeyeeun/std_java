package com.jjava.lecture.function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//함수의 사용
		int sum = add(3,4);
		System.out.println(sum);
	}
		
	//public 리턴 자료형 메소드명 (입력자료형1 입력 변수1 입력 자료형 2 입력 변수 2 ...)
	// ... 
	// return 리턴값 리턴 자료형이 void인 경우에는 필요하지 않음
	//함수 선언
	public static int add(int a, int b) {
	
		int sum = a+b;
		
		
		return sum;
	}
		
	public int abc () {
		
	return 1 ;
	
	}
	
	public String bbb () {
		
	
		return "";
		
	}

	public boolean ccc() {
		
		return true;
	}
	}

