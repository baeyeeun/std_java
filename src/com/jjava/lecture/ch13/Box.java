package com.jjava.lecture.ch13;

public class Box<T> {

	private T t; //���� ������ Ÿ�� ������ �ʰ� ���߿� ����� �� ���ϰڴ�

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}



}
