package com.helloworld;

public class Stack_usage {
	public static void main(String[] args) {
		Stack new_stack = new Stack(); // declaring new stack
		for (int i = 0; i < 10; ++i) {
			new_stack.push(i); // pushing elements of stack
		}
		for (int i = 0; i < 10; ++i) {
			System.out.println(new_stack.pop()); // printing elements
		}

	}
}
