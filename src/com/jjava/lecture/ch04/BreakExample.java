package com.jjava.lecture.ch04;

public class BreakExample {

	public static void main(String[] args) {
		
		
	while(true) {
		int num = (int) ((Math.random()*6)+1);
		System.out.println(num);
		
		if(num==6) {
			break;
		}
		
		
	} System.out.println("process ended!");
	 //6�� ������ ���α׷� ����
	 //Math.ramdom() * (max - min * 1) + min
	 //0.0~1.0�� ����� double�� �� ��ȯ
	}

}
