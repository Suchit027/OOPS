package Figure;

public class Areas {
	public static void main(String[] args) {
		// var Figure = new figure(); is illegal as figure is abstract class
		// but reference variables can be created
		figure ref;
		var rec = new Rectangle(2, 2);
		var tri = new Triangle(2, 2);
		ref = rec;
		System.out.println("Area of rectangle " + ref.area());
		ref = tri;
		System.out.println("Area of triangle " + ref.area());
	}
}
