package com.github.antoniolike.thefantasy.tools;

import java.util.Arrays;

public class ArraysOperations {
	public static int[] productArray(int[] array) {
		//For each element calculates the product of all the other elements and returns them in an array
		int[] product = new int[array.length];
		int prod;
		int index = 0;
		for(int i : array) {
			prod = 1;
			for(int j : array) {
				if (i!=j) {
					prod*=j;
				}
			}
			product[index] = prod;
			index++;
		}
		return product;
	}
	
	public static void sort(int[] array) {
		Arrays.sort(array);
	}
}
