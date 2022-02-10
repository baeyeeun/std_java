package com.jjava.lecture.ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
	
		int scoreA = 75;
		int scoreB = 99;
		
		if(scoreA > scoreB) {
			System.out.println("A의 점수가 B보다 높습니다.");
			
		} else if(scoreA < scoreB) {
			System.out.println("B의 점수가 A보다 높습니다.");

		} else if(scoreA == scoreB){
			System.out.println("A와 B의 점수는 같습니다.");
		} else {
			System.out.println("정신 차리세요!");
		}

	}

}
