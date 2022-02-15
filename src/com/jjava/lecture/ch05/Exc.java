package com.jjava.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
		
		//2부터 구까지 정수혈 배열 변수 2개를 만들고
		//for문을 사용하여 구구단 출력을 하시오.
		
		int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int result = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) { //닫힌 것 괄호 잘 보기!
				
				result = arr1[i]*arr2[j];
				
				System.out.println(arr1[i]+ "X"+ arr2[j] + "=" +result);
		}
		

	}

}
}
