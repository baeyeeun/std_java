package com.jjava.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
	
	String str1 = "µµÄì";
	String str2 = "µµÄì";
	String str3 = new String("µµÄì");
	
	boolean result1 = (str1==str2);

	System.out.println("result1 : "+result1);

	boolean result2 = (str1==str3);

	System.out.println("result2 : "+result2);
	
	System.out.println("str1.equals(str2) : "+ str1.equals(str2));
	System.out.println("str1.equals(str3) : "+ str1.equals(str3));
	
	//equals´Â ¹®ÀÚ¿­ ºñ±³
	}

}
