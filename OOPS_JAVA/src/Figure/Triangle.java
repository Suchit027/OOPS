package Figure;

public class Triangle extends figure {

//constructor
	public Triangle(double h, double l) {
		super(h, l);
	}

	public double area() {
		return ((dim1 * dim2) / 2);
	}
}
