package com.dsa_lessons.chapter_3;

public class RecursiveDivideAndConquer {

	public static void main(String[] args) {

		int[] scores = {1, 2, 3, 4, 5};
		int ans = sum(scores, 0);
		System.out.printf("Sum of scores: %d%n", ans);

		int[] ages = {4, 5, 6, 7, 8, 9};
		System.out.printf("Sum of ages: %d%n", sum(ages));
	}

	private static int sum(int[] data, int startIndex) {
		// base case - only one element left
		if (startIndex == data.length - 1)
			return data[startIndex];

		// recursive case - current element plus sum of rest
		return data[startIndex] + sum(data, startIndex + 1);
	}

	private static int sum(int[] data) {
		if (data.length == 0) return 0;

		return sum(data, 0);
	}

}
