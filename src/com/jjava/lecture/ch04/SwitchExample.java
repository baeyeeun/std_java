package com.jjava.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
	/*int num = 5;
	
	switch(num) {
	case 1:
		System.out.println("1��");
		break;
	case 2:
		System.out.println("2��");
		break;
	case 3:
		System.out.println("3��");
		break;
	case 4:
		System.out.println("4��");
		break;
	case 5:
		System.out.println("5��");
		break;
	default:
		System.out.println("0��");
		break;
	}*/

	 int num1 = (int) (Math.random() * (6 - 1 + 1) +1);
	 int num2 = (int) (Math.random() * (6 - 1 + 1) +1);
	 int num3 = num1 + num2;
	 
	 System.out.println("ù ��° �ֻ�����"+num1+"���Դϴ�.");
	 System.out.println("�� ��° �ֻ�����"+num2+"���Դϴ�.");
	 System.out.println("�� �ֻ����� ����"+num3+"�Դϴ�.");
	}

}
