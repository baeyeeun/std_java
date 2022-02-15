package com.jjava.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		// 개수만 우선 정하고 데이터는 나중에 채워 넣겠다.
		
		strArray[0] = "고구려";
		strArray[1] = "백제";
		strArray[2] = new String("고구려");
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);

		//equals : String 객체의 함수 : 문자열 비교
		
		/* int에서는 equlas가 안 됨
		int[] score = {100, 100, 100};
		System.out.println(score[0].equlas(score[0]));*/
		
	
	}

}
