package com.jjava.lecture.ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
	
		int[] score = {88, 87,90};
		int sum= 0;
		
		System.out.println("score.length :" + score.length);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			//배열을 사용할 때에는 배열의 개수 말고 score.length를 사용해서 작성
		}
		System.out.println("총합은 : "+ sum);
	}

}
