package com.dsa_lessons.chapter_4;

/**
 * Exercise 4.2
 * Count number of items in a list by recursion
 */
public class CountListByRecursion {
	public static void main(String[] args) {
		int[] scores = {3, 0, 15, 5, 1, 19, 9, 4, 22, 8, 11, 6, 7, 17, 2};
		System.out.printf("Number of elements: %d%n", count(scores));
	}

	private static int count(int[] data) {
		return count(data, 0);
	}

	private static int count(int[] data, int start) {
		
		if (start == data.length)
			return start;
		
		return count(data, start + 1);
	}
}
