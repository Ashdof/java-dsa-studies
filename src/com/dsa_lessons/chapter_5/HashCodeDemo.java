package com.dsa_lessons.chapter_5;

/**
 * Demonstration of Hash Function
 */

public class HashCodeDemo {
	public static void main(String[] args) {
		String[] names = {"Kojo", "Adjoa", "Kwabena", "Abena", "Kweku", "Kuukua", "Yaw", "Yaa", "Kofi", "Efua"};
		int tableSize = 15;
		System.out.printf("Hash Distribution (table size %s)%n", tableSize);
		for (String name : names) {
			int hashCode = hashString(name, tableSize);
			System.out.printf("%-10s%2d%n", name, hashCode);
		}
	}
	
	/**
	 * Simple polynomial rolling hash function for Strings.
	 * @param key the hash key 
	 * @param tableSize the size of the hash table
	 * @return the computed hash code 
	 */
	private static int hashString(String key, int tableSize) {
		if (key == null || key.isEmpty())return 0;
		
		int hash = 0;
		final int PRIME = 31;
		
		for (int i = 0; i < key.length(); i++) {
			hash = hash * PRIME + key.charAt(i);
		}
		
		// It should be a non-negative value and fit in the table
		return Math.abs(hash) % tableSize;
	}
}
