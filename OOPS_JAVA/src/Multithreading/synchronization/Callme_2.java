package Multithreading.synchronization;

public class Callme_2 {
	void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("]");
	}
}
