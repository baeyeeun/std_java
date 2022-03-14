package com.jjava.lecture.ch13;

public class ProductExample2 {

	public static void main(String[] args) {
	
		Product<Car, Integer> product = new Product<>();
		
		product.setKind(new Car());
		product.setModel(500);
		
		Car rtCar = product.getKind();
		int rtInt = product.getModel();
		
		System.out.println(rtCar + " " + rtInt);
		

	}

}
