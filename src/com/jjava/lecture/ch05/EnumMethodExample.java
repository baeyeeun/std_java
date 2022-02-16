package com.jjava.lecture.ch05;

public class EnumMethodExample {

	public static void main(String[] args) {

		Week today= Week.SUNDAY;
		System.out.println(today); //week 형
		
		String name= today.name();
		System.out.println(name); //string 형
		
		int ordinal = today.ordinal();
		System.out.println(ordinal); //인덱스까지 포함
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 =day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말입니다.");
		} else {
			System.out.println("평일입니다.");
		}
		
		Week[] days = Week.values();
		
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
