package com.jjava.lecture.ch04;

public class BreakOutterExample {

	public static void main(String[] args) {
		
		Outter:
			for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower=='g') {
						break Outter;
						//원래라면 for에서 끝나는 게 맞지만 더 상위의 것이 종료되게 하기 위해 Outter 이라는 것으로 표기
					}
				}
			}
		System.out.println("프로그램 실행 종료");
	}

}
