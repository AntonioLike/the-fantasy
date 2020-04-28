package com.github.antoniolike.thefantasy.tools;

import java.util.function.Function;

public class LambdaOperations {
	public static Function<Integer, Integer> squareFunction() {
		return (x->x*x);
	}
}
