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

