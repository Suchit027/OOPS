package com.helloworld;

import java.util.Scanner;

public class Stack_usage {
	public static void main(String[] args) {
		try (Scanner myinput = new Scanner(System.in)) {
			int size = myinput.nextInt();
			Stack new_stack = new Stack(size); // declaring new stack
			for (int i = 0; i < size; ++i) {
				new_stack.push(i); // pushing elements of stack
			}
			for (int i = 0; i < size; ++i) {
				System.out.println(new_stack.pop()); // printing elements
			}
		}

	}
}
