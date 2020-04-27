package com.github.antoniolike.thefantasy.tools;

public abstract class MathOperations {
	public static double[] randomArrayOfNumbers(double smallest, double highest, int size) {
		double[] randomArray = new double[size];
		for(int i=0; i<size;i++)
			randomArray[i]= Math.random()*(highest-smallest)+smallest;
		return randomArray;
	}
}
