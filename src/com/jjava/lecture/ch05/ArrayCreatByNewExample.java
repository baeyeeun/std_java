package com.jjava.lecture.ch05;

public class ArrayCreatByNewExample {

	public static void main(String[] args) {
	
		int[] arr1 = new int [3]; //�����͸� �̸� �Է����� �ʰ�, ���� �������� ������ �Է�
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]"+arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;

		for(int i=0; i<3; i++) {
		System.out.println("arr1["+i+"]"+arr1[i]);
	}
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]"+arr2[i]);
		}
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;

		for(int i=0; i<3; i++) {
		System.out.println("arr2["+i+"]"+arr2[i]);
	}
		
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
		}
		
		arr3[0] = "����";
		arr3[1] = "����";
		arr3[2] = "�Ŷ�";

		for(int i=0; i<3; i++) {
		System.out.println("arr3["+i+"]"+arr3[i]);
		
		//�����ʹ� ���糪 ���� ����
	}
		
	}

}
