package Figure;

abstract class figure {
	double dim1, dim2;

// constructor
	public figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

//making an abstract method
	abstract double area();

//abstract classes can have normal methods
	void show() {
		System.out.println("A normal method of figure class");
	}
}
