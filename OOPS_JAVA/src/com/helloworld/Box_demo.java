package com.helloworld;

public class Box_demo {

	double width;
	double height;
	double length;

	Box_demo(double w, double h, double l) { // making the constructor
		width = w; // could have also used this.width; 'this' is used to refer to the object which
					// invoked the method
		height = h;
		length = l;
	}

	Box_demo() { // default constructor
		width = -1;
		height = -1;
		length = -1;
	}

	Box_demo(double side) {// constructor for squares
		width = length = height = side;
	}

	double volume() {
		double vol;
		vol = width * height * length;
		return vol;
	}

}

class Box_demo {
	public static void main(String[] args) {
		Box_demo mybox1 = new Box_demo(10, 10, 10);
		Box_demo mybox2 = new Box_demo(11);
		System.out.println("Volume of box 1 is " + mybox1.volume());
		System.out.println("Volume of box 2 is " + mybox2.volume());
	}
}
