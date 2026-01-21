package com.dsa_lessons.chapter_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Basic demonstration of the sorting algorithm
 */
public class SortingAlgoDemo {
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(23, 45, 100, 76, 34, 56, 99, 31, 0, 5));
		System.out.printf("Original data: %s%n", scores);

		ArrayList<Integer> sortedData = SortingUtil.demoSelectionSort(scores);
		System.out.printf("Sorted data: %s%n", sortedData);
	}
}
