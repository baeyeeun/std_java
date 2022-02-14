package com.jjava.lecture.ch04;

public class BreakExample {

	public static void main(String[] args) {
		
		
	while(true) {
		int num = (int) ((Math.random()*6)+1);
		System.out.println(num);
		
		if(num==6) {
			break;
		}
		
		
	} System.out.println("process ended!");
	 //6이 나오면 프로그램 종료
	 //Math.ramdom() * (max - min * 1) + min
	 //0.0~1.0에 가까운 double로 형 변환
	}

}
