package com.jjava.lecture.ch04;

public class WhileSumFromTo100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i = 1;
			int sum = 0;
			
			while(i<=10) {
				
				System.out.println(i);
				sum += i;
				i++;
				
				System.out.println("1부터 10까지의 합은 : " + sum);
			}
	}

}
