package com.jjava.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//로또 번호 생성기 1~56번, 여섯 개
		
		int lotto1 = (int)(Math.random()*44)+1;
		int lotto2 = (int)(Math.random()*44)+1;;
		int lotto3 = (int)(Math.random()*44)+1;;
		int lotto4 = (int)(Math.random()*44)+1;;
		int lotto5 = (int)(Math.random()*44)+1;;
		int lotto6 = (int)(Math.random()*44)+1;;
		
		System.out.println("로또 1번 : "+lotto1);
		System.out.println("로또 2번 : "+lotto2);
		System.out.println("로또 3번 : "+lotto3);
		System.out.println("로또 4번 : "+lotto4);
		System.out.println("로또 5번 : "+lotto5);
		System.out.println("로또 6번 : "+lotto6);
		
		int i; //로또
		int j;
		
		for(i=0; i < 45; i++) {
			
		}
	}

}
