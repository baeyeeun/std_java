package com.jjava.lecture.ch05;

public class TestMultiArray {

	public static void main(String[] args) {
	
		String[][] bbs = {
				{"�ʵ�","���к� �߰��հ� ���� ���! ���� ���ش�?! [4]","�����ǽ�","2022.02.15","404"},
				{"�ʵ�","[���� �հݱ�� �ʴ�� �̺�Ʈ]���� 5õ�� ����+���� �����! [37]","�����ǽ�","2022.01.28.1","497����"},		
				{"����","���� ���� [3] new","��Ż��","01:30","151"},	
				{"����","���躸�鼭 ������ �б� ķ�۽� Ư¡ [1] new","alikj22","11:30","108"},
				{"����","���Կ��� ���� �ٽɳ�Ʈ+���Լ��� ������ ������ ����! [4] new","�����ǽ�","01:04","29"},
						
		};
		

			for(int i=0; i<bbs.length; i++) {
				for(String bb : bbs[i]) {
					
				System.out.print(bb + "\t");
				
				}
				System.out.println();
			}
			
			

	}

}