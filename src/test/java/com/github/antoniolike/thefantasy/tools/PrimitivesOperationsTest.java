package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimitivesOperationsTest {

	@Test
	void testMaxByteValue() {
		assertTrue(PrimitivesOperations.maxByteValue()==Byte.MAX_VALUE);
	}

	@Test
	void testMaxShortValue() {
		assertTrue(PrimitivesOperations.maxShortValue()==Short.MAX_VALUE);
	}

	@Test
	void testMaxIntValue() {
		assertTrue(PrimitivesOperations.maxIntValue()==Integer.MAX_VALUE);
	}

	@Test
	void testMaxLongValue() {
		assertTrue(PrimitivesOperations.maxLongValue()==Long.MAX_VALUE);
	}

	@Test
	void testMaxFloatValue() {
		assertTrue(PrimitivesOperations.maxFloatValue()==Float.MAX_VALUE);
	}

	@Test
	void testMaxDoubleValue() {
		assertTrue(PrimitivesOperations.maxDoubleValue()==Double.MAX_VALUE);
	}

	@Test
	void testMaxCharValue() {
		assertTrue(PrimitivesOperations.maxCharValue()==Character.MAX_VALUE);
	}

	@Test
	void testMaxBooleanValue() {
		assertTrue(PrimitivesOperations.maxBooleanValue()==true);
	}

	@Test
	void testSafeDivision() {
		assertTrue(PrimitivesOperations.safeDivision(10, 2) == 5);
		assertTrue(PrimitivesOperations.safeDivision(5, 2) == 2);
		assertDoesNotThrow(()->PrimitivesOperations.safeDivision(0, 0));
		assertTrue(PrimitivesOperations.safeDivision(2, 0) == 0);
	}

}
