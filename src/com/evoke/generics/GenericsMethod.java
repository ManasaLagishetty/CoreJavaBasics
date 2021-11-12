package com.evoke.generics;

public class GenericsMethod {

	public <E> void printArray(E[] elements) {
		
		for (E value : elements) {
			System.out.print(value + ",");
		}
		System.out.println();

	}

}

/*
 * public void arrays(int[] intArray) { 
 * 
 * }
 * 
 * public void arrays(char[] charArray) {
 * 
 * } 
 * public void arrays(String[] stringArray) {
 * 
 * }
 */