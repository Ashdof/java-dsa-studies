package com.dsa_lessons.chapter_4;

/**
 * Exercise 4.4
 * Come up with the base case and the recursive case for the
 * binary search from chapter 1
 */
public class BinarySearchByRecursion {
	public static void main(String[] args) {
		int[] scores = {1, 2, 3, 4, 5, 6};
		int search = 3;
		int position = binarySearch(scores, search);
		System.out.printf("Found %d at index %d%n", search, position);
	}

	private static int binarySearch(int[] data, int element) {
		return search(data, element, 0, data.length - 1);
	}
	
	private static int search(int[] data, int element, int left, int right) {
		
		// base case
		if (left > right)
			return -1;
		
		int middleValue = left + (right - left) / 2;

		// recursive cases
		if (data[middleValue] == element)
			return middleValue;
		else if (data[middleValue] > element) 
			return search(data, element, left, middleValue - 1);
		else
			return search(data, element, middleValue + 1, right); 
	}
}
