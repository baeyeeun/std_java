package com.jjava.lecture.ch06;

public class sixCar {

	String model= "";
	int speed;
	
	public sixCar(String model) {
		
		this.model = model;
		
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	
	public void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü� : "
			+ this.speed + "km/h");
		}
	}
	
}
