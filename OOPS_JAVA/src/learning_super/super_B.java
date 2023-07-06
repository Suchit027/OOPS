package learning_super;

public class super_B extends super_A {
	int i;

	public super_B() {
		System.out.println("Then class B's default constructor is executed");
	}

	super_B(int a, int b) {
		super.i = a;
		i = b;
	}

	// notice that super is used to access show of class A
	// the show method of class B overrides the show of class A
	// this only happens when both the methods have the same parameters and names
	void show() {
		System.out.println("i in superclass " + super.i);
		System.out.println("i in this class " + i);
	}
}
