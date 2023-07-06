package Box;

// can't access boxwieght members here. Only box can be accessed
// we can copy data from boxweight object to colorbox object but can only use methods of box class
public class ColorBox extends box {
	String color;

	public ColorBox() {
		super();
		color = "null";
	}

	ColorBox(double w, double h, double l, String c) {
		super(w, h, l);
		color = c;
	}
}
