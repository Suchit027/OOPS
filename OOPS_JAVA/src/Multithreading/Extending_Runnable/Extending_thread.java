package Multithreading.Extending_Runnable;

public class Extending_thread extends Thread {

//default constructor
	public Extending_thread() {
		super("Demo thread");
	}

	public void run() {
		try {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Print - " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread interrupted");
		}
	}
}
