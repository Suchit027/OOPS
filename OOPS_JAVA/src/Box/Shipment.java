package Box;

public class Shipment extends Box_weight {
	double cost;

// constructor to clone an object
	public Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}

//constructor when all parameters are present
	Shipment(double w, double h, double l, double m, double c) {
		super(w, h, l, m);
		cost = c;
	}

//default constructor
	Shipment() {
		super();
		cost = -1;
	}
	
//constructor for cube
	Shipment(double l, double m, double c){
		super(l, m);
		cost = c;
	}
}
