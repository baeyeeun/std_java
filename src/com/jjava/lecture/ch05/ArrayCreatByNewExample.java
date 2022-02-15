package com.jjava.lecture.ch05;

public class ArrayCreatByNewExample {

	public static void main(String[] args) {
	
		int[] arr1 = new int [3]; //데이터를 미리 입력하지 않고, 받을 데이터의 개수만 입력
		
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
		
		arr3[0] = "고구려";
		arr3[1] = "백제";
		arr3[2] = "신라";

		for(int i=0; i<3; i++) {
		System.out.println("arr3["+i+"]"+arr3[i]);
		
		//데이터는 언재나 변경 가능
	}
		
	}

}
