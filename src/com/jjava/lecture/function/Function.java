package com.jjava.lecture.function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Լ��� ���
		int sum = add(3,4);
		System.out.println(sum);
	}
		
	//public ���� �ڷ��� �޼ҵ�� (�Է��ڷ���1 �Է� ����1 �Է� �ڷ��� 2 �Է� ���� 2 ...)
	// ... 
	// return ���ϰ� ���� �ڷ����� void�� ��쿡�� �ʿ����� ����
	//�Լ� ����
	public static int add(int a, int b) {
	
		int sum = a+b;
		
		
		return sum;
	}
		
	public int abc () {
		
	return 1 ;
	
	}
	
	public String bbb () {
		
	
		return "";
		
	}

	public boolean ccc() {
		
		return true;
	}
	}

