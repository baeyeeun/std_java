package com.jjava.lecture.ch04;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
		//초기화식 조건식 증감식
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int a = 1; a <= 10; a++) {
			/* sum += i; */
			sum = sum + a;
		}
		System.out.println(sum);
		
	}
}
	
	
	
