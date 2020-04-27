package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StreamOperationsTest {

	@Test
	void testAvgOfSquares() {
		long[] array = new long[] {1,2,3,4,5};
		assertEquals(11,StreamOperations.avgOfSquares(array));
		assertEquals(StreamOperations.avgOfSquares(null),0);
		
	}

}
