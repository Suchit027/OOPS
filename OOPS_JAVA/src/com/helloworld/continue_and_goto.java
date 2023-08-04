package com.helloworld;

public class continue_and_goto {
	public static void main(String[] args) {
		boolean t = true;

		first: for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.println("First this is printed");
				if (t)
					continue first;
			}
			System.out.println("This is never printed");
		}
	}
}
