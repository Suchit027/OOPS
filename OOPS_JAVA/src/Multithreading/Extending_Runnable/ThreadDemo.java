package Multithreading.Extending_Runnable;

public class ThreadDemo {
	public static void main(String[] args) {
		// var test1 = new NewThread();
		// test1.t.start();
		var test1 = new Extending_thread();
		test1.start();
		try {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Main thread - " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}
