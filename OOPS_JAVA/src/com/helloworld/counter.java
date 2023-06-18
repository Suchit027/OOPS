package com.helloworld;

// without static variable
//public class counter {
//	int count = 0;
//	public counter() {
//		count++;
//		System.out.println(count);
//	}

public class counter {
	static int count = 0;

	public counter() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		counter new1 = new counter();
		counter new2 = new counter();
		counter new3 = new counter();
	}
}
