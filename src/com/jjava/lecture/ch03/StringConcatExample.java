package com.jjava.lecture.ch03;

public class StringConcatExample {

	public static void main(String[] args) {
	//���ڿ��� �� String ���
		
	String str1= "JDK" + 1.8;
	String str2= str1+ "�Դϴ�.";
	
	System.out.println("str2:"+str2);
			
	//�̸� ��ȭ��ȣ
	
	String strA = "����";
	String strB = "010-1234-5678";
	String strC = strA + strB;
	
	System.out.println("strC : "+strC);
	}

}
