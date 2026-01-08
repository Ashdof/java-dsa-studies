package com.dsa_lessons.chapter_1;

/**
 * Pseudo code for Binary Search Algorithm
 * 
 * 1. Obtain the starting and ending values of the list as left and right variables
 * 2. Initiate a loop for while left is less than right
 * 	a. Compute the middle value of the list
 * 	b. Obtain the middle element of the list using the middle value from step "a" as the guess variable
 * 	c. Compare the guess variable with the search element
 * 	d. If they are the same, return the middle value as the position of the element in the list
 * 	e. If the guess variable is greater than the search element, decrease the middle value by 1 and assign it to the right variable
 * 	f. If the guess variable is less than the search element, increase the middle value by 1 and assign it to the left variable
 * 3. Outside the loop, the element is not in the list, so we return -1.
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] scores = {1, 2, 3, 4, 5, 6};
		int search = 10;
		int position = binarySearch(scores, search);
		System.out.printf("Found %d at index %d%n", search, position);
	}
	
	/**
	 * Search for the element
	 * @param data the array of data
	 * @param element the search object
	 * @return the index of the search object in the array if found, 
	 * or -1 if not found
	 */
	private static int binarySearch(int[] data, int element) {
		if (data.length == 0) return -1;
		
		int left = 0, right = data.length - 1;
		while (left < right) {
			int mid = left + right;
			int guess = data[mid];
			if (guess == element)
				return mid;
			
			if (guess > element)
				right = mid - 1;
			else
				left = mid + 1;
		}
		
		return -1;
	}
}
