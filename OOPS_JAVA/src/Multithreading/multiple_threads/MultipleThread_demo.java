package Multithreading.multiple_threads;

public class MultipleThread_demo {
	public static void main(String[] args) {
		NewThread test1 = new NewThread("Thread1");
		NewThread test2 = new NewThread("Thread2");
		NewThread test3 = new NewThread("Thread3");

		// the order in which they print their code is not constant
		test1.t.start();
		test2.t.start();
		test3.t.start();
		System.out.println("Main thread starting");
		try {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Main : " + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
