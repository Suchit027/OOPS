package Multithreading;

public class Demo_sleep {

	// notice sleep method is static for thread class
	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			try {
				System.out.println("Print - " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
		}
	}
}
