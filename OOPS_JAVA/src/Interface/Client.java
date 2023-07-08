package Interface;

public class Client implements Callback {
	// if not all methods of the interface are used then the class has to be
	// declared abstract
	public void callback(int element) {
		System.out.println("This implements interface Callback");
	}

	void nonInterface() {
		System.out.println("This shows that a class implementing an interface can have other methods");
	}
}
