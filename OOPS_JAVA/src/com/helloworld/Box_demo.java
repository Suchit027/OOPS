package com.helloworld;

public class Box_demo {
	public static void main(String[] args) {
		box mybox1 = new box(10, 10, 10);
		box mybox2 = new box(11);
		System.out.println("Volume of box 1 is " + mybox1.volume());
		System.out.println("Volume of box 2 is " + mybox2.volume());
	}
}
