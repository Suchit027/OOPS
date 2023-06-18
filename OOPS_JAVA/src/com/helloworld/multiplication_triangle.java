package com.helloworld;

public class multiplication_triangle {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; ++i) {
			for (int j = 0; j <= 10; ++j) {
				if (j > i) {
					continue; // good use of continue
				}
				System.out.print(" " + i * j); // notice blank space need
			}
			System.out.println();
		}
	}
}
