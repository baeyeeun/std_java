package com.jjava.lecture.ch03;

public class IncreaseDecreaseOperatprExample {

	public static void main(String[] args) {
	
		
		//++ : 1 증감 
		//-- : 1 감소
		
		//++x;
		//x**;
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x);
		
		y++;
		System.out.println(y);

		a = ++x;
		b = x++;
		System.out.println(a);
		System.out.println(b);
		
	}

}
