package com.jjava.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
		
		//2���� ������ ������ �迭 ���� 2���� �����
		//for���� ����Ͽ� ������ ����� �Ͻÿ�.
		
		int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int result = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) { //���� �� ��ȣ �� ����!
				
				result = arr1[i]*arr2[j];
				
				System.out.println(arr1[i]+ "X"+ arr2[j] + "=" +result);
		}
		

	}

}
}
