package com.helloworld;

public class Factorial {
	int ans; // result of factorial
// can't have fact static as then we will have to make ans static which would'nt allow multiple factorial values to be generated
	int fact(int num) {

		if (num > 1) {
			ans = num * fact(--num);
			return ans;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Factorial ob = new Factorial();
		System.out.println(ob.fact(4));
	}
}
