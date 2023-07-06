package Box;

public class Demo_shipment {
	public static void main(String[] args) {
		var shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		double vol;
		// notice we can use volume defined in box here
		vol = shipment1.volume();
		System.out.println("Volume of shipment1 is " + vol);
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Cost of shipment1 is " + shipment1.cost);
	}
}
