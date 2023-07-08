package Stacks;

public class DynamicStack implements IntStack {
	private int arr[];
	private int pos;

// default constructor
	public DynamicStack() {
		arr = new int[1];
		pos = -1;
	}

//constructor
	DynamicStack(int size) {
		arr = new int[size];
		pos = -1;
	}

	public void push(int element) {
		if (pos + 1 == arr.length) {
			int test[] = new int[2 * arr.length];
			for (int i = 0; i < arr.length; ++i) {
				test[i] = arr[i];
			}
			arr = test;
			arr[++pos] = element;
		} else {
			arr[++pos] = element;
		}
	}

	public int pop() {
		if (pos < 0) {
			System.out.println("error: stack underflow");
			return -1;
		} else {
			return arr[pos--];
		}
	}
}
