package com.dsa_lessons.chapter_4;

public class SumByDivideAndConquer {
	public static void main(String[] args) {
		int[] ages = {2, 3, 4, 5, 6, 7, 8, 9};
		int sum = computeSum(ages);
		System.out.printf("Sum of ages: %d%n", sum);
	}

	private static int computeSum(int[] data) {
		return sum(data, 0);
	}
	
	private static int sum(int data[], int start) {
		
		// base case
		if (start == data.length - 1)
			return data[start];
		
		// recursive case
		return data[start] + sum(data, start + 1);
	}
}
