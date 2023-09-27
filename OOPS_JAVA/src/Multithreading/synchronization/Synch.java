package Multithreading.synchronization;

public class Synch {
	public static void main(String[] args) {
		var test = new Callme_2();
		var test1 = new Caller_2(test, "hello");
		var test2 = new Caller_2(test, "hi");
		var test3 = new Caller_2(test, "bye");

		test1.t.start();
		test2.t.start();
		test3.t.start();

		try {
			test1.t.join();
			test2.t.join();
			test3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}
