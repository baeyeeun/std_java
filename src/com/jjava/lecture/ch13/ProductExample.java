package com.jjava.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
	
		Product<String, String> product = new Product<>(); 

		product.setKind("하얀 목도리");
		product.setModel("백제가 직접 뜬");
		
		String kind = product.getKind();
		String model = product.getModel();
		
		System.out.println("선물 종류 : " + kind);
		System.out.println("made by? : " + model);
		
		System.out.println("내가 선물 받은 것은 " + product.getModel() + product.getKind() + "입니다.");
		
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
		product3.setModel("모닝");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();

		System.out.println(rtCar +  rtString2);
	}

}
