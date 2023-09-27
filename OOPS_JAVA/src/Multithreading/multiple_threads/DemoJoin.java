package Multithreading.multiple_threads;

public class DemoJoin {
	public static void main(String[] args) {
		var test1 = new NewThread("Thread1");
		var test2 = new NewThread("Thread2");
		var test3 = new NewThread("Thread3");

		test1.t.start();
		test2.t.start();
		test3.t.start();

		System.out.println("Thread1 is alive - " + test1.t.isAlive());
		System.out.println("Thread2 is alive - " + test2.t.isAlive());
		System.out.println("Thread3 is alive - " + test3.t.isAlive());

		// notice the exception used
		try {
			System.out.println("Waiting for threads to finish");
			test1.t.join();
			test2.t.join();
			test3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		System.out.println("Thread1 is alive - " + test1.t.isAlive());
		System.out.println("Thread2 is alive - " + test2.t.isAlive());
		System.out.println("Thread3 is alive - " + test3.t.isAlive());
		System.out.println("Main thread exiting");

	}
}
