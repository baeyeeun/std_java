package com.jjava.lecture.ch07;

public class SupersonicAirplane extends Airplane{

//	public static final int NORMAL = 1;
//	public static final int SUPERSONIC =2;
//	
//	public int flyMode = NORMAL;
//
//	@Override
//	public void fly() {
//		if(flyMode == SUPERSONIC) {
//			
//			System.out.println("������ �����Դϴ�.");
//			
//		}
//
//		super.fly();
//	}

//������� ���� �� �ڵ�
	
	public int flyMode = Constants.NORMAL;

	@Override
	public void fly() {
		if(flyMode == Constants.SUPERSONIC) {
			
			System.out.println("������ �����Դϴ�.");
		
		} else {
			
		
		super.fly();
	}
}

	
	
	
	
	
}
