package com.jjava.lecture.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	
	int charCode= 'A';
	
	//&& = and 연산 참 참 참, 나머지 폴스
	//|| = or 연산 참 폴스 참, 폴스 참 참, 참참참, 폴스폴스폴스
	
	//전체적으로 참이어야 출력
	
	if((charCode>=65) & (charCode<=90)) { // true true 전체적으로true
		System.out.println("대문자군요.");
	}
	if((charCode>=97) && (charCode<=122)) { // 거짓 참 (거짓)
		System.out.println("소문자이군요.");
	}
	if((charCode<48) && ! (charCode>57)) { //거짓 -> 참, 참-> 거짓 출력 안 댐
		System.out.println("0~9 숫자이군요.");
	}
	

	if((charCode>=65) | (charCode<=90)) {
		System.out.println("대문자군요.");
	}

	if((charCode>=97) || (charCode<=122)) {
		System.out.println("소문자이군요.");
	}
	if((charCode<48) || (charCode>57)) {
		System.out.println("0~9 숫자이군요.");
	}
	
	int value = 6;
	
	if((value%2==0) | (value%3==0)) {
		System.out.println("2 또는 2의 배수이군요.");	
	}
	
	if((value%2==0) || (value%3==0)) {
		System.out.println("2 또는 2의 배수이군요.");	
	}

}
}
