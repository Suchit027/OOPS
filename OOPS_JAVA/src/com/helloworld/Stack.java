package com.helloworld;

class Stack {
	int stk[] = new int[10]; // int stack
	int pos; // position of stack

	// constructor
	Stack() {
		pos = -1; // initial position of stack has to be -1 to allow pop to work without bugs
	}

//pushing stack values
	void push(int data) {
		if (pos == 10) {
			System.out.println("error: stack full");
		}
		stk[++pos] = data;
	}

// Popping stack values
	int pop() {
		if (pos >= 0) {
			return stk[pos--];
		} else {
			System.out.println("error: stack empty");
			return 0;
		}
	}

}
