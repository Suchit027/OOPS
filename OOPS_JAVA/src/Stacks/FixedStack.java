package Stacks;

import java.util.Scanner;

class FixedStack implements IntStack{
	private int stk[]; // int stack
	private int pos; // position of stack

	// constructor
	public FixedStack(int size) {
		stk = new int[size];
		pos = -1; // initial position of stack has to be -1 to allow pop to work without bugs
	}

//pushing stack values
	public void push(int data) {
		if (pos == (stk.length - 1)) {
			System.out.println("error: stack full");
		}
		stk[++pos] = data;
	}

// Popping stack values
	public int pop() {
		if (pos >= 0) {
			return stk[pos--];
		} else {
			System.out.println("error: stack empty");
			return 0;
		}
	}

	public static void main(String[] args) {
		try (Scanner myinput = new Scanner(System.in)) {
			int size = myinput.nextInt();
			FixedStack new_stack = new FixedStack(size); // declaring new stack
			for (int i = 0; i < size; ++i) {
				new_stack.push(i); // pushing elements of stack
			}
			for (int i = 0; i < size; ++i) {
				System.out.println(new_stack.pop()); // printing elements
			}
		}

	}
}
