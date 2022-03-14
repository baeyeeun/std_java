package com.jjava.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
	
		Product<String, String> product = new Product<>(); 

		product.setKind("�Ͼ� �񵵸�");
		product.setModel("������ ���� ��");
		
		String kind = product.getKind();
		String model = product.getModel();
		
		System.out.println("���� ���� : " + kind);
		System.out.println("made by? : " + model);
		
		System.out.println("���� ���� ���� ���� " + product.getModel() + product.getKind() + "�Դϴ�.");
		
		Product<Tv, String> product2 = new Product<>();
		//product2.setKind(new Tv());
		
		Tv tv = new Tv();
		product2.setKind(tv);
		product2.setModel("OLED TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv);
		System.out.println(rtString);
		
		Product<Car, String> product3 = new Product<>();
		
		product3.setKind(new Car());
		product3.setModel("���");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();

		System.out.println(rtCar +  rtString2);
	}

}
