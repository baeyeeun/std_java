package com.jjava.lecture.ch13;

public class Util2 {

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return KeyCompare && valueCompare;
	}
}
