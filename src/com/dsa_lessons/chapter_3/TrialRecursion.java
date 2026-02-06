package com.dsa_lessons.chapter_3;

public class TrialRecursion {

	public static void main(String[] args) {
		System.out.println("Recursion Countdown:");
		countDown(5);
		
		System.out.println("\nLoop Countdown:");
		countDownLoop(5);
	}
	
	private static void countDown(int i) {		
		System.out.println(i);
		if (i == 0)
			return;
		else
			countDown(--i);
	}
	
	private static void countDownLoop(int i) {
		for (int j = i; j >= 0; j--)
			System.out.println(j);	
	}
}
