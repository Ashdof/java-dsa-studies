package com.dsa_lessons.chapter_4;

public class EuclideGCDDemo {
	public static void main(String[] args) {
		
		System.out.printf("GCD of %d and %d: %d%n", 1680, 640, gcd(1680, 640));
		System.out.printf("GCD of %d and %d: %d%n", 1680, 640, gcd(48, 18));
	}
	
	private static int gcd(int a, int b) {
		// base case
		if (b == 0) {
			return a;
		}
		
		// recursive case
		return gcd(b, a % b);
	}
}
