package com.jjava.lecture.ch07;

public class MyFriendInfoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.setName("�̼���");
		myFriendDetailInfo.setAge(50);
		myFriendDetailInfo.setFriendAddress("����Ư���� ������ �����");
		myFriendDetailInfo.setFriendNumber("010-9999-9999");
		
		System.out.println("�̸� :" + myFriendDetailInfo.getName());
		System.out.println("���� : " + myFriendDetailInfo.getAge());
		System.out.println("�ּ� : " + myFriendDetailInfo.getFriendAddress());
		System.out.println("��ȣ : " + myFriendDetailInfo.getFriendNumber());
	}

}
