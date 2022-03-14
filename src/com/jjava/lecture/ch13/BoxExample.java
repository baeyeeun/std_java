package com.jjava.lecture.ch13;

public class BoxExample {
	public static void main(String[] args) {
	
	// Box 객체 중에서 한 개 즉 지네릭 타입은 String으로 된 것이다.
	// String t;
		
	Box<String> box= new Box<String>();
	
	box.set("이백제");
	String name = box.get();
	
	System.out.println("이름 : "+ name);
	
	
	Box<Integer> box2 = new Box<Integer>();
	
	box2.set(24);
	int number = box2.get();
	
	System.out.println("나이 : " + number);
	
	
	Box<String> box3 = new Box<String>();
	
	box3.set("주호 남편");
	String job = box3.get();
	
	System.out.println("직업 : " + job);
	
}
}
