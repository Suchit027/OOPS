package call_methods;

class test {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

public class call_by_value {
	public static void main(String[] args) {
		test one = new test();
		int a = 3, b = 5;
		one.meth(a, b);
		System.out.println(a + " " + b); // the output doesn't change the value of a and b
	}
}
