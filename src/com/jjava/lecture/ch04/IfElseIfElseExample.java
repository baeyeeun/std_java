package com.jjava.lecture.ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
	
		int scoreA = 75;
		int scoreB = 99;
		
		if(scoreA > scoreB) {
			System.out.println("A�� ������ B���� �����ϴ�.");
			
		} else if(scoreA < scoreB) {
			System.out.println("B�� ������ A���� �����ϴ�.");

		} else if(scoreA == scoreB){
			System.out.println("A�� B�� ������ �����ϴ�.");
		} else {
			System.out.println("���� ��������!");
		}

	}

}
