package com.jjava.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
	
		SecondCar secondcar = new SecondCar();
		
		secondcar.company = "����";
		secondcar.model = "2022 ����2 �Ϸ�Ʈ��";
		secondcar.color = "white";
		secondcar.maxSpeed = 200;
		
		System.out.println("company : " + secondcar.company);
		System.out.println("model : " + secondcar.model);
		System.out.println("color : " + secondcar.color);
		System.out.println("maxSpeed : " + secondcar.maxSpeed);

		SecondCar secondcar2 =  new SecondCar("2002 ������ ������");
		
		secondcar2.company="�ֿ��ڵ���";
		
		System.out.println("-----------------------");
		System.out.println("company : " + secondcar2.company);
		System.out.println("model : " + secondcar2.model);
		System.out.println("color : " + secondcar2.color);
		System.out.println("maxSpeed : " + secondcar2.maxSpeed);
		
		SecondCar secondcar3 =  new SecondCar("2022 ������ Ʈ������", "black");
		
		secondcar3.company ="������";
		
		System.out.println("-----------------------");
		System.out.println("company : " + secondcar3.company);
		System.out.println("model : " + secondcar3.model);
		System.out.println("color : " + secondcar3.color);
		System.out.println("maxSpeed : " + secondcar3.maxSpeed);
		
		SecondCar secondcar4 =  new SecondCar("20220 QM6", "red", 300);
		
		secondcar4.company= "����Ｚ�ڵ���";
		
		System.out.println("-----------------------");
		System.out.println("company : " + secondcar4.company);
		System.out.println("model : " + secondcar4.model);
		System.out.println("color : " + secondcar4.color);
		System.out.println("maxSpeed : " + secondcar4.maxSpeed);
		
	}

}
