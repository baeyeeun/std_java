package com.jjava.lecture.ch06;

public class SevenCar {

	static int speed = 0;
	
	static void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		
	speed = 10;
	run();
	
	SevenCar sevenCar = new SevenCar();
	
	sevenCar.speed = 10;
	
	
	
	}
	
}
