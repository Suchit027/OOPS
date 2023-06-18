package com.helloworld;

public class Factorial {
	int ans; // result of factorial

	int fact(int num) {

		if (num > 1) {
			ans = num * fact(--num);
			return ans;
		} else {
			return 1;
		}
	}
}
