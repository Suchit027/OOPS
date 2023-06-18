package com.helloworld;

class test1 {
	int a, b;

	test1(int i, int j) { // constructor
		a = i;
		b = j;
	}

	void meth(test1 ob) {
		ob.a *= 2;
		ob.b /= 4;
	}
}

public class call_by_reference {
	public static void main(String[] args) {
		test1 one = new test1(5, 10);
		one.meth(one);
		System.out.println(one.a + " " + one.b);
	}
}
