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
		
		//�������̽��� ������ Ŭ������ ����ó�� �Ϲ� Ŭ���� ��ü ���� ���� �ϸ� �� �ȴ�.
		//�������̽��� ������ Ŭ������ ����ؾ� �Ѵ�.
		
		//RemoteControl remoteControl; //�������̽� ���� ����
		//remoteControl = new Audio(); //���� ��ü�� �ʱ�ȭ
		
		//RemoteControl remoteControl = new Audio();
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		remoteControl.setMute(false);
	}

}
