package com.jjava.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		// ������ �켱 ���ϰ� �����ʹ� ���߿� ä�� �ְڴ�.
		
		strArray[0] = "����";
		strArray[1] = "����";
		strArray[2] = new String("����");
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);

		//equals : String ��ü�� �Լ� : ���ڿ� ��
		
		/* int������ equlas�� �� ��
		int[] score = {100, 100, 100};
		System.out.println(score[0].equlas(score[0]));*/
		
	
	}

}
