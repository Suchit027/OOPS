package Box;

public class Box_weight extends box {
	double weight;

// default constructor
	public Box_weight() {
		super();
		weight = -1;
	}

// constructor with all values
// use Ctrl + spacebar to access super of various constructors of superclass
	Box_weight(double w, double h, double l, double m) {
		super(w, h, l);
		weight = m;
	}

// constructor for cube
	Box_weight(double side, double m) {
		super(side);
		weight = m;
	}

// constructor for copies
	Box_weight(Box_weight ob) {
		super(ob);
		weight = ob.weight;
	}

	public void display() {
		System.out.println("Weight of the box is = " + weight);
	}

	public static void main(String[] args) {
		Box_weight box1 = new Box_weight(4, 4);
		box1.display();
	}
}
