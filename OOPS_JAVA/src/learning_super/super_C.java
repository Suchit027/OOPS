package learning_super;

public class super_C extends super_B {
	public super_C() {
		System.out.println("Then C class's default constructor is executed");
	}

	public static void main(String[] args) {
		var test = new super_C();
	}
}
