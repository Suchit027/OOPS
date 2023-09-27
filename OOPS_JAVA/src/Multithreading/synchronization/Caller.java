package Multithreading.synchronization;

public class Caller implements Runnable {
	Callme target;
	String msg;
	Thread t;

	// default constructor
	// notice that the thread method doesn't have name parameter
	public Caller(Callme tar, String text) {
		target = tar;
		msg = text;
		t = new Thread(this);
	}

	public void run() {
		target.call(msg);
	}
}
