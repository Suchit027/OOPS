package com.helloworld;

public class String_and_switch {
	public static void main(String[] args) {
		String str = "abc";
		switch (str) {
		case "abc":
			System.out.println("string found");
			break;
		case "acd":
			System.out.println("string not found");
			break;
		default:
			System.out.println("default case");
		}
		// syntax error appears if two cases are absolutely same
	}
}
