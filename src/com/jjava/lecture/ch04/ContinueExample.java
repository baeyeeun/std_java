package com.jjava.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
	
		/*int i;
		
		for(i=1; i<=10; i++) {

		 if(i%2 != 0) { //2로 나누었을 때 떨어진다면 짝수만 출력, 3으로 나누었을 때 떨어진다면 홀수만 출력
			continue;
		}
	
		System.out.println(i);
	} */
		
		int a=1;

		while(a<=10) { //1 ture 2 ture
			if(a%2 == 0) { //1 false 2 ture 2 ture
				continue;
			}
			
		System.out.println(a);
		a++;
			}
		}
	}



