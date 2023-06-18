package com.helloworld;

class box {

	double width;
	double height;
	double length;

	box(double w, double h, double l) { // making the constructor
		width = w; // could have also used this.width; 'this' is used to refer to the object which
					// invoked the method
		height = h;
		length = l;
	}

	box() { // default constructor
		width = -1;
		height = -1;
		length = -1;
	}

	box(double side) {// constructor for squares
		width = length = height = side;
	}
	
	double volume() {
		double vol;
		vol = width * height * length;
		return vol;
	}

}

public class Box_demo {
	public static void main(String[] args) {
		box mybox1 = new box(10, 10, 10);
		box mybox2 = new box(11);
		System.out.println("Volume of box 1 is " + mybox1.volume());
		System.out.println("Volume of box 2 is " + mybox2.volume());
	}
}
