package Multithreading.Interthread;

public class Q {
	int n;
	boolean valueset = false;

	synchronized void put(int n) {
		while (valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}

			this.n = n;
			valueset = true;
			System.out.println("Put - " + n);
			notify();
	}

	synchronized void get() {
		while (!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}

			valueset = false;
			System.out.println("Get - " + this.n);
			notify();
	}
}
