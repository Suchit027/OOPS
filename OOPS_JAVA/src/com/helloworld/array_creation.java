package com.helloworld;

public class array_creation {
	public static void main(String[] args) {
		// in java we have to initialize each array element except those of int, float, etc.
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		for (int i = 0; i < 5; ++i) {
			System.out.println(arr[i]);
		}
		// array declaration could also have been done by arr[5];
	}
}
