package Multithreading.ticktock;

public class Demo {
	public static void main(String[] args) {
		var ob = new TickTock();
		var th1 = new Thread_creator("Tick", ob); // tick comes first as start method runs from constructor
		var th2 = new Thread_creator("Tock", ob);
		try {
			th1.t.join();
			th2.t.join();
		} catch (InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}
}
