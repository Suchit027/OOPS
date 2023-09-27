package Multithreading;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Name of main thread - " + t.getName());
		System.out.println("Set name of current thread - ");
		var myinput = new Scanner(System.in);
		String line = myinput.nextLine();
		t.setName(line);

		// notice getname method
		System.out.println("Name of main thread - " + t.getName());
	}
}
