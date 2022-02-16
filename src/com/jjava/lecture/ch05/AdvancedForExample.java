package com.jjava.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {90, 100, 99, 98, 87};
		String str1 ="ddddd";
		int a = 0;
		
		for(int score : scores) {
			
			System.out.println(a+": score :" + score);
			a++;
		}
		
		/*for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}*/
	}

}
