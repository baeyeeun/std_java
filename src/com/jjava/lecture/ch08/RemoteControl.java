package com.jjava.lecture.ch08;

public interface RemoteControl {

	public String name = "����";
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� : ���� Ŭ�������� ������ �������̵� �ؾ� �Ѵ�
	
	void turnOff();
	void turnOn();
	void setVulume(int Volume);
	
	//����Ʈ �޼ҵ� : public ���� ����
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		} else {
			System.out.println("���� �����մϴ�.");
		}

	
	}
	
	//���� �޼ҵ�
	static void ChangeBattery() {
		System.out.println("�������� ��ȯ�ϼ���.");
	}
}
