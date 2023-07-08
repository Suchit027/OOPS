package Interface;

public class NewClient implements AnotherClient.NestedInterface {
	public void show() {
		System.out.println("Implementing nested interfaces");
	}
}
