package com.github.antoniolike.thefantasy.tools;

import java.util.Arrays;

public abstract class StreamOperations {
	public static long avgOfSquares(long [] array) {
		if(array==null||array.length==0)
			return 0;
		return (long) Arrays.stream(array).map(x->x*x).average().orElse(0);
	}
}
