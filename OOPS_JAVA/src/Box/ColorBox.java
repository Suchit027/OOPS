package Box;

// can't access boxwieght members here. Only box can be accessed
// we can copy data from boxweight object to colorbox object but can only use methods of box class
public class ColorBox extends box {
	String color;

	// default constructor
	public ColorBox() {
		super();
		color = "null";
	}

	// constructor for copies
	ColorBox(ColorBox ob) {
		super(ob);
		color = ob.color;
	}

	// constructor
	ColorBox(double w, double h, double l, String c) {
		super(w, h, l);
		color = c;
	}
}
