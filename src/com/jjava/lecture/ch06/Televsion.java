package com.jjava.lecture.ch06;

public class Televsion {

	static String company= "�Ｚ";
	static String model = "OLED";
	static String info;
	static String desc = company + model;
	static String version = "1.0";
	
	static {
		
		info = company + "" + model + version;
		
	}
}
