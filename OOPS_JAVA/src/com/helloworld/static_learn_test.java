package com.helloworld;

public class static_learn_test {
	public static void main(String[] args) {
		static_learn student1 = new static_learn(1, "Karan");
		static_learn student2 = new static_learn(2, "Aryan");
		student1.display();
		student2.display();
		static_learn.change();
		student1.display();
		student2.display();
		System.out.println("Cube ans = " + static_learn.cube(5));
	}
}
