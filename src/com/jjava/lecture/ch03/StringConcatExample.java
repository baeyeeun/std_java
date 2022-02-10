package com.jjava.lecture.ch03;

public class StringConcatExample {

	public static void main(String[] args) {
	//문자열은 다 String 사용
		
	String str1= "JDK" + 1.8;
	String str2= str1+ "입니다.";
	
	System.out.println("str2:"+str2);
			
	//이름 전화번호
	
	String strA = "도쿄";
	String strB = "010-1234-5678";
	String strC = strA + strB;
	
	System.out.println("strC : "+strC);
	}

}
