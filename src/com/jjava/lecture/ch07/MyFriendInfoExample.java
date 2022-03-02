package com.jjava.lecture.ch07;

public class MyFriendInfoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.setName("이순신");
		myFriendDetailInfo.setAge(50);
		myFriendDetailInfo.setFriendAddress("서울특별시 강남구 어디쯤");
		myFriendDetailInfo.setFriendNumber("010-9999-9999");
		
		System.out.println("이름 :" + myFriendDetailInfo.getName());
		System.out.println("나이 : " + myFriendDetailInfo.getAge());
		System.out.println("주소 : " + myFriendDetailInfo.getFriendAddress());
		System.out.println("번호 : " + myFriendDetailInfo.getFriendNumber());
	}

}
