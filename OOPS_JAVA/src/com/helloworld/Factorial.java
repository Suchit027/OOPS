package com.helloworld;

public class Factorial {
	static int ans; // result of factorial

	static int fact(int num) {

		if (num > 1) {
			ans = num * fact(--num);
			return ans;
		} else {
			return 1;
		}
	}
}
