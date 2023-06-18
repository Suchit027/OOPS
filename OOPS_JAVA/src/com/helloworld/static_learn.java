package com.helloworld;

public class static_learn {
	int roll_no;
	String name;
	static String college = "MIT"; // single memory for all instances

	public static_learn(int a, String b) {
		roll_no = a;
		name = b;
	}

// only static method can change value of static variable; can be invoked with just the name of the class, no need of an instance
	static void change() {
		college = "Manipal institute of Technology";
	}

	public void display() {
		System.out.println(roll_no + " " + name + " " + college);
	}
}
