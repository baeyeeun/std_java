package com.jjava.lecture.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
	
	//������ �迭
	//2*n (�� * ��) : ���� * ����
	//�տ� ������  �Ʒ�(��), �����ʿ��� ����(��)
		
	int[][] score = {{99,88},{77,66},{55,44},{33,22},{11,00}};

	/*int[][] score2 = new int[2][3];
	int[][] score3 = new int [2][];
	score3[0] = new int[2];
	score3[1] = new int[2];
	score3[2] = new int[2];*/
	
	System.out.println("score.length : " + score.length);
	
	for(int i=0; i<score.length; i++) {
		
		System.out.println(score[i].length);
		
		for(int j=0; j<score[i].length; j++) {
			
		System.out.println("score["+ i + "]" + "[" + j + "] :" + score[i][j]);

		}
		
		System.out.println();

	}
	
	score[2][1] = 100;
	System.out.println("score[2][1] ���� : "+ score[2][1]);	
	
	}

}
