package com.jjava.lecture.ch05;

public class ArrayCreateByListExample1 {

	public static void main(String[] args) {
		/*
		int[]  score; //����
		int  score2[]; //����
		
		int[] score3 = {1,2,3}; //��ü ����
		int score4[] = {4,5,6}; //��ü ����
		
		double[] score6 = {1,2,3,4};
		
		String[] strArray= {"ī����", "����", "����", "�״�"};
		
		//������ ������ Ÿ���� �Ȱ��ƾ� ��
		
		//������ ������ 0���� ����(index)
		//������ �����ϰ� �ø� �� ����
		
		*/

		int[] score = {90,95,100, 87};
		
		System.out.println("score[0]"+ score[0]);
		System.out.println("score[1]"+ score[1]);
		System.out.println("score[2]"+ score[2]);
		System.out.println("score[3]"+ score[3]);
		
		int sum=0;
		
		for(int i=0; i<4; i++) {
			sum += score[i];
		} 
			
		
		
		System.out.println("������ : "+ sum);
		
		double avg = (double) sum/4;
		System.out.println("����� : " + avg);
		
		}

	}


