package com.github.antoniolike.thefantasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.tools.ArraysOperations;
import com.github.antoniolike.thefantasy.tools.MathOperations;

class MathOperationsTest {

	@Test
	void testRandomArrayOfNumbers() {
		double[] testArray = MathOperations.randomArrayOfNumbers(5.2, 7.9, 20);
		assertTrue(ArraysOperations.max(testArray)<=7.9 && ArraysOperations.min(testArray)>=5.2);
	}

}
