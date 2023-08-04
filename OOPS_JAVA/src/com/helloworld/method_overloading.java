package com.helloworld;

// demonstrating overloading of methods
class testing {
	public void test() {
		System.out.println("No parameters");
	}

	public void test(char a) {
		System.out.println("One parameter = " + a);
	}

	public void test(double b, double c) {
		System.out.println("Two parameters = " + b + c);
	}

	public int test(int d) {
		System.out.println("One parameter with return value " + d);
		return 1;
	}

}

public class method_overloading {
	public static void main(String[] args) {
		testing new_test = new testing();
		new_test.test();
		new_test.test('a');
		new_test.test(6);
		new_test.test(1.23, 2.34);

	}
}