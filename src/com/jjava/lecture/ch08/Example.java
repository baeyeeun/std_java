package com.jjava.lecture.ch08;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceA interfaceA = new ImplementationC();
		InterfaceB interfaceB = new ImplementationC();
		InterfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();
		interfaceB.methodB();
		interfaceC.methodC();
		
	}

}
