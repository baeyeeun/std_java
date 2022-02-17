package com.jjava.lecture.function;

public class Funtion1 {

	public static void main(String[] args) {


		int result1 = add(3,4);
		int result2 = sub(10,9);
		int result3 = div(108, 7);
		int result4 = mul(51,49);
		
	}

		public static int add(int a, int b) {
			
		int result1 = a + (b+5);
		
		System.out.println(result1);
		
		return result1;
		}
		
		
		public static int sub(int a, int b) {
			
		int result2 = a - b;
		
		System.out.println(result2);
		 
		return result2;
		}
		
		public static int div(int a, int b) {
		
		int result3 = a / b;
		
		System.out.println(result3);
			
		return result3;	
		}
		
		public static int mul(int a, int b) {
			
		int result4 = a * b;
		
		System.out.println(result4);
			
		return result4;	
		}
		
}


