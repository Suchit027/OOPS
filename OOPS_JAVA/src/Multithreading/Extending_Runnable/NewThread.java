package Multithreading.Extending_Runnable;

public class NewThread implements Runnable {
	Thread t;

//default constructor
	public NewThread() {
		t = new Thread(this, "Demo Thread");
	}

	public void run() {
		// notice getName
		System.out.println(t.getName());
		// notice output for this
		System.out.println(t);
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
