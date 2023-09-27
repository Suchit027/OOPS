package Multithreading.synchronization;

public class Caller_2 implements Runnable {
	String msg;
	Callme_2 target;
	Thread t;

	public Caller_2(Callme_2 tar, String text) {
		msg = text;
		target = tar;
		t = new Thread(this);
	}

	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}
}
