package com.helloworld;

public class user_input {
	// menu selection program
	class Menu {
		public static void main(String[] args) 
				throws java.io.IOException {
			char choice;
			do {
				System.out.println("Help on:");
				System.out.println("1: if");
				System.out.println("2: switch");
				System.out.println("3: while");
				System.out.println("4: do-while");
				System.out.println("5: for");
				choice = (char) System.in.read(); // Important
			} while (choice < '1' || choice > '5');
			System.out.println("\n");
			switch (choice) {
			case '1':
				System.out.println("if(statement)condition");
				break;
			case '2':
				System.out.println("switch(expression)");
				System.out.println("case 1:..break;...");
				break;
			case '3':
				System.out.println("while(expression){statements}");
				break;
			case '4':
				System.out.println("do{statements}while(expression);");
				break;
			case '5':
				System.out.println("for(initialization;condition;incrementation)");
				break;
			default:
				System.err.println("error");
			}
		}
	}
}
