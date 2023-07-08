package Box;

class box {

	double width;
	double height;
	double length;

	// making the constructor could have also used this.width; 'this' is used to
	// refer to the object which invoked the method
	public box(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	// default constructor
	public box() {
		width = -1;
		height = -1;
		length = -1;
	}

	// constructor for squares
	public box(double side) {
		width = length = height = side;
	}

	// constructor to create copies
	public box(box ob) {
		width = ob.width;
		height = ob.height;
		length = ob.length;
	}

	public double volume() {
		double vol;
		vol = width * height * length;
		return vol;
	}

	public static void main(String[] args) {
		box mybox1 = new box(10, 10, 10);
		box mybox2 = new box(11);
		System.out.println("Volume of box 1 is " + mybox1.volume());
		System.out.println("Volume of box 2 is " + mybox2.volume());
	}

}
