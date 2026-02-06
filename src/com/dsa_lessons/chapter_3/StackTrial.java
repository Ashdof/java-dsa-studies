package com.dsa_lessons.chapter_3;

public class StackTrial {
	public static void main(String[] args) {
		greet("Jay Kay");
	}
	
	private static void greet(String name) {
		System.out.printf("Hello, %s!%n", name);
		greet2(name);
		System.out.println("Getting ready to say goodbye ...");
		bye();
	}
	
	private static void greet2(String name) {
		System.out.printf("How are you, %s!%n", name);
	}
	
	private static void bye() {
		System.out.println("Okay, bye!");
	}
}
