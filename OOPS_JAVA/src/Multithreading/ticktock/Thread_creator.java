package Multithreading.ticktock;

public class Thread_creator implements Runnable {
	Thread t;
	TickTock ob;

	public Thread_creator(String name, TickTock ob) {
		this.ob = ob;
		t = new Thread(this, name); // used to segregate tick and tock
		t.start();
	}

	public void run() {
		if (t.getName().equals("Tick")) {
			for (int i = 0; i < 5; ++i) {
				try {
					ob.tick(true);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				ob.tick(false);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			for (int i = 0; i < 5; ++i) {
				try {
					ob.tock(true);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				ob.tock(false);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
