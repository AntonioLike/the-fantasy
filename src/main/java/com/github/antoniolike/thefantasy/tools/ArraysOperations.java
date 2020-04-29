package com.github.antoniolike.thefantasy.tools;

import java.util.Arrays;

public abstract class ArraysOperations {
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
	
	public static double max(double[] array) {
		if(array == null || array.length==0)
			throw new IllegalArgumentException("The array is null or its size is null");
		
		double maxValue=array[0];
		for(double d:array)
			if(d>maxValue)
				maxValue = d;
		return maxValue;
	}
	
	public static double min(double[] array) {
		if(array == null || array.length==0)
			throw new IllegalArgumentException("The array is null or its size is null");
		
		double minValue=array[0];
		for(double d:array)
			if(d<minValue)
				minValue = d;
		return minValue;
	}
}
