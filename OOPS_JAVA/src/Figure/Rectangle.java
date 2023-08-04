package Figure;

// without adding abstract methods, error is displayed
public class Rectangle extends figure {

// constructor
	public Rectangle(double a, double b) {
		super(a, b);
	}

	public double area() {
		return dim1 * dim2;
	}
}
