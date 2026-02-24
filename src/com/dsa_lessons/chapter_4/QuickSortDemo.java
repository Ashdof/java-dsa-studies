package com.dsa_lessons.chapter_4;

import java.util.Arrays;

/**
 * QuickSortDemo:
 * Demonstration of standard Quick Sort algorithm by Grok
 */
public class QuickSortDemo {
	public static void main(String[] args) {
		int[] data = {3, 5, 4, 8, 6, 11, 3, 7, 0, 3};
		System.out.printf("Before sorting: %s%n", Arrays.toString(data));
		
		quickSort(data);

		System.out.printf("After sorting: %s%n", Arrays.toString(data));
	}

	public static void quickSort(int[] data) {
		if (data == null || data.length <= 1)
			return;
		
		quickSort(data, 0, data.length - 1);
	}
	
	private static void quickSort(int[] data, int left, int right) {
		// base case
		if (left > right)
			return;
		
		// partition and get final pivot position
		int pivot = partition(data, left, right);
		
		// Recurse on left and right sub-arrays
		quickSort(data, left, pivot - 1);
		quickSort(data, pivot + 1, right);
	}

	/**
	 * Lomuto Partition Scheme:
	 * computes the final index where pivot is placed
	 * @param data the array data
	 * @param left the index of the first element
	 * @param right the index of the last element
	 * @return the final index
	 */
	private static int partition(int[] data, int left, int right) {
		
		int pivot = data[right];	// last element as pivot 
		int i = left - 1;			// index of smallest value
		
		for (int j = left; j < right; j++) {
			if (data[j] <= pivot) {
				i++;
				swap(data, i, j);
			}
		}
		
		// Place pivot in correct position
		swap(data, i + 1, right);
		return i+1;
	}
	
	/**
	 * Swap the positions of two elements in the array
	 * @param data the array
	 * @param a the first element
	 * @param b the second element
	 */
	private static void swap(int[] data, int a, int b) {
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}
}
