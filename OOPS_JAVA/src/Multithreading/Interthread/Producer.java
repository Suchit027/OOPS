package Multithreading.Interthread;

public class Producer implements Runnable {
	Q q;
	Thread t;

	public Producer(Q q) {
		this.q = q;
		t = new Thread(this);
	}

	public void run() {
		for (int i = 0; i < 5; ++i) {
			q.put(i);
		}
	}
}
