package com.dsa_lessons.chapter_4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * MyQuickSort
 * My implementation of the QuickSort Algorithm
 * Time complexity is O(n log n) 
 */
public class MyQuickSort {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>(Arrays.asList(3, 5, 4, 8, 6, 11, 3, 7, 0, 3));
		System.out.printf("Before sorting: %s%n", data.toString());
		ArrayList<Integer> sorted = quickSort(data);
		System.out.printf("After sorting: %s%n", sorted.toString());
	}

	private static ArrayList<Integer> quickSort(ArrayList<Integer> data) {

		// base case
		if (data.size() < 2)
			return data;

		int pivot = data.getFirst();
		
		ArrayList<Integer> less = new ArrayList<>();
		ArrayList<Integer> great = new ArrayList<>();
		ArrayList<Integer> equal = new ArrayList<>();
		ArrayList<Integer> sorted = new ArrayList<>();
		
		for (int datum : data) {
			if (datum < pivot)
				less.add(datum);
			else if (datum > pivot)
				great.add(datum);
			else
				equal.add(datum);
		}

		ArrayList<Integer> newLess = quickSort(less);
		ArrayList<Integer> newGreat = quickSort(great);

		sorted.addAll(newLess);
		sorted.addAll(equal);
		sorted.addAll(newGreat);

		return sorted;
	}
	
	
	
	
	
	
	
	
	
}
