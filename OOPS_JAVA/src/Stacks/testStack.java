package Stacks;

public class testStack {
	public static void main(String[] args) {
		var test1 = new DynamicStack(5);
		for (int i = 0; i < 10; ++i) {
			test1.push(i);
		}
		for (int i = 0; i < 10; ++i) {
			System.out.println(test1.pop());
		}
	}
}
