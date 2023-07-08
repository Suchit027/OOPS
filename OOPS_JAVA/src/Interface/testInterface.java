package Interface;

public class testInterface {
	public static void main(String[] args) {
		// we can create new objects of classes implementing an interface with interface
		// names
		// we can also create reference variable like Callback test1;
		// but no objects of Callback
		Callback test1 = new Client();
		test1.callback(1);
		Callback test2 = new AnotherClient();
		test2.callback(0);
		// this way we can refer one object to another implementing the same interface
		test1 = test2;
		test1.callback(0);
		// testing nested interface
		AnotherClient.NestedInterface test3 = new NewClient();
		test3.show();
	}
}
