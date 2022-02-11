package com.jjava.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
	/*int num = 5;
	
	switch(num) {
	case 1:
		System.out.println("1번");
		break;
	case 2:
		System.out.println("2번");
		break;
	case 3:
		System.out.println("3번");
		break;
	case 4:
		System.out.println("4번");
		break;
	case 5:
		System.out.println("5번");
		break;
	default:
		System.out.println("0번");
		break;
	}*/

	 int num1 = (int) (Math.random() * (6 - 1 + 1) +1);
	 int num2 = (int) (Math.random() * (6 - 1 + 1) +1);
	 int num3 = num1 + num2;
	 
	 System.out.println("첫 번째 주사위는"+num1+"번입니다.");
	 System.out.println("두 번째 주사위는"+num2+"번입니다.");
	 System.out.println("두 주사위의 합은"+num3+"입니다.");
	}

}
