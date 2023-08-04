package com.helloworld;

public class break_and_goto {
	public static void main(String[] args) {
		boolean t = true;
		first: {
			System.out.println("First line printed");
			second: {
				third: {
					System.out.println("Before breaking");
					if (t)
						break second;
				}
				System.out.println("Second line not printed");
			}
		}
		block1: {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Only this will be printed " + i);
				for (int j = 0; j < 5; ++j) {
					if (j > 3)
						break block1;
				}
			}
		}
	}
}
