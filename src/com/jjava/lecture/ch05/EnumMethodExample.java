package com.jjava.lecture.ch05;

public class EnumMethodExample {

	public static void main(String[] args) {

		Week today= Week.SUNDAY;
		System.out.println(today); //week ��
		
		String name= today.name();
		System.out.println(name); //string ��
		
		int ordinal = today.ordinal();
		System.out.println(ordinal); //�ε������� ����
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 =day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		Week[] days = Week.values();
		
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
