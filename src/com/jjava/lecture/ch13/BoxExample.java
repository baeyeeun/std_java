package com.jjava.lecture.ch13;

public class BoxExample {
	public static void main(String[] args) {
	
	// Box ��ü �߿��� �� �� �� ���׸� Ÿ���� String���� �� ���̴�.
	// String t;
		
	Box<String> box= new Box<String>();
	
	box.set("�̹���");
	String name = box.get();
	
	System.out.println("�̸� : "+ name);
	
	
	Box<Integer> box2 = new Box<Integer>();
	
	box2.set(24);
	int number = box2.get();
	
	System.out.println("���� : " + number);
	
	
	Box<String> box3 = new Box<String>();
	
	box3.set("��ȣ ����");
	String job = box3.get();
	
	System.out.println("���� : " + job);
	
}
}
