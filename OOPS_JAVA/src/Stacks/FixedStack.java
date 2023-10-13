package Stacks;

import java.util.Scanner;

class FixedStack implements IntStack {
	private int stk[]; // int stack
	private int pos; // position of stack

	// constructor
	public FixedStack(int size) {
		stk = new int[size];
		pos = -1; // initial position of stack has to be -1 to allow pop to work without bugs
	}

//pushing stack values
	public void push(int data) {
		try {
			if (pos == stk.length - 1) {
				throw new PushException();
			}
			stk[++pos] = data;
		} catch (PushException exe) {
			System.out.println(exe.toString());
		}

	}

// Popping stack values
	public int pop() {
		try {
			if(pos == -1) {
				throw new PopException();
			}
			return stk[pos--];
		}
		catch(PopException exe){
			System.out.println(exe.toString());
			return -1;
		}
	}

	public static void main(String[] args) {
		try (Scanner myinput = new Scanner(System.in)) {
			int size = myinput.nextInt();
			FixedStack new_stack = new FixedStack(size); // declaring new stack
			for (int i = 0; i < size; ++i) {
				new_stack.push(i); // pushing elements of stack
			}
			new_stack.push(size);
			for (int i = 0; i < size; ++i) {
				System.out.println(new_stack.pop()); // printing elements
			}
			new_stack.pop();
		}

	}
}
