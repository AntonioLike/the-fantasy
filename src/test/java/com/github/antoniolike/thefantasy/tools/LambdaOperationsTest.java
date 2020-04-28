package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LambdaOperationsTest {

	@Test
	void testSquareFunction() {
		int value = 5;
		assertEquals(5*5,LambdaOperations.squareFunction().apply(value));
	}

}
