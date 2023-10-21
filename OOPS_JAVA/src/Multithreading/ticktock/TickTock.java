package Multithreading.ticktock;

public class TickTock {

	String status;

	synchronized void tick(boolean valueset) throws InterruptedException {
		while (!valueset) { // ending clock
			status = "ticked";
			notify();
			return;
		}
		System.out.println("Tick");
		status = "ticked";
		notify();
		try {
			while (status.compareTo("ticked") == 0) {
				wait();
			}
		} catch (InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}

	synchronized void tock(boolean valueset) throws InterruptedException {
		while (!valueset) {
			status = "tocked";
			notify();
			return;
		}
		System.out.println("Tock");
		status = "tocked";
		notify();
		try {
			while (status.compareTo("tocked") == 0) {
				wait();
			}
		} catch (InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}
}
