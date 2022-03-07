package com.jjava.lecture.ch08;

public interface RemoteControl {

	public String name = "백제";
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 : 구현 클래스에서 무조건 오버라이드 해야 한다
	
	void turnOff();
	void turnOn();
	void setVulume(int Volume);
	
	//디폴트 메소드 : public 생략 가능
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다.");
		}

	
	}
	
	//정적 메소드
	static void ChangeBattery() {
		System.out.println("건전지를 교환하세요.");
	}
}
