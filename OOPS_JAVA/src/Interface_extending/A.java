package Interface_extending;

public interface A {
	default void show() {
		System.out.println("default method show in interface A implementation");
	};

	// notice that default methods are just like classes
	default String getString() {
		return "Default string";
	}
}
