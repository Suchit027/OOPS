package Interface_extending;

public class Implementation implements B {
	// comment this method to see default interface method implementation
	public void show() {
		System.out.println("method of interface A");
	}

	public void show1() {
		System.out.println("method of interface B");
	}

	public static void main(String[] args) {
		Implementation test = new Implementation();
		test.show();
		test.show1();
	}
}
