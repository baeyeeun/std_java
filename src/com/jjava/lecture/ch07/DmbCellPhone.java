package com.jjava.lecture.ch07;

public class DmbCellPhone extends CellPhone{

	int channel;
	
	//������
	
	DmbCellPhone(String model, String color, int channel){
		
		this.model = model;
		this.color= color;
		this.channel = channel;
		
	}
	
	//�޼ҵ�
	
	void trunOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
}