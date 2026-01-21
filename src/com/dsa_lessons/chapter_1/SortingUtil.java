package com.dsa_lessons.chapter_1;

import java.util.ArrayList;

public class SortingUtil {

	/**
	 * Get the index of the smallest value in the array
	 * @param data the array
	 * @param start the starting position
	 * @return the index of the smallest value
	 */
	private static int getSmallestIndex(ArrayList<Integer> data) {
		if (data == null || data.isEmpty())
			throw new IllegalArgumentException("Error, array must not be empty");
		
		int minIndex = 0;
		for (int i = 0 + 1; i < data.size(); i++) {
			if (data.get(i) < data.get(minIndex))
				minIndex = i;
		}

		return minIndex;
	}

	/**
	 * Sort the array of data using selection approach
	 * @param data the array of data
	 * @return the sorted data
	 */
	public static ArrayList<Integer> demoSelectionSort(ArrayList<Integer> data) {
		if (data == null || data.isEmpty())
			throw new IllegalArgumentException("Error, array must not be empty");
		
		ArrayList<Integer> sortedData = new ArrayList<>();
		while (data.size() > 0) {
			int index = getSmallestIndex(data);
			sortedData.add(data.remove(index));
		}

		return sortedData;
	}
}
