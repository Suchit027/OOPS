package Interface;

public class AnotherClient implements Callback {
	public void callback(int element) {
		System.out.println("Another implementation of interface Callback");
	}

	public interface NestedInterface {
		void show();
	}
}
