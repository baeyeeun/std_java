package com.jjava.lecture.ch08;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");

	}

	@Override
	public void setVulume(int Volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("ÇöÀç TV º¼·ý : " + volume);
	}
	
	public int getVolume() {
		return volume;
	}


}
