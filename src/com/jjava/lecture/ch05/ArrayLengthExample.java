package com.jjava.lecture.ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
	
		int[] score = {88, 87,90};
		int sum= 0;
		
		System.out.println("score.length :" + score.length);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			//�迭�� ����� ������ �迭�� ���� ���� score.length�� ����ؼ� �ۼ�
		}
		System.out.println("������ : "+ sum);
	}

}
