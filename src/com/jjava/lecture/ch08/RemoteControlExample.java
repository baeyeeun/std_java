package com.jjava.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Audio audio = new Audio();
		
		//audio.trunOn();
		//audio.trunOff();
		
		Television television = new Television();
		
		television.turnOff();
		television.turnOn();
		
		//인터페이스를 구현한 클래스는 위에처럼 일반 클래스 객체 만들 듯이 하면 안 된다.
		//인터페이스를 구현한 클래스를 사용해야 한다.
		
		//RemoteControl remoteControl; //인터페이스 변수 선언
		//remoteControl = new Audio(); //구현 객체로 초기화
		
		//RemoteControl remoteControl = new Audio();
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		remoteControl.setMute(false);
	}

}
