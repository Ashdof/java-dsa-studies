package com.dsa_lessons.chapter_4;

/**
 * Exercise 4.3
 * Compute the maximum value in a list by recursion
 */
public class ComputeMaxValueByRecursion {
	public static void main(String[] args) {
		int[] scores = {65, 34, 77, 69, 23, 45, 76, 58, 49};
		System.out.printf("Maximum score: %d%n", computeMax(scores));
	}

	private static int computeMax(int[] data) {
		return maxValue(data, 0);
	}
	
	private static int maxValue(int[] data, int start) {

		// base case
		if (start == data.length - 1)
			return data[start];
		
		int max = maxValue(data, start + 1);
		if (data[start] > max)
			return data[start];

		return max;
	}
}
