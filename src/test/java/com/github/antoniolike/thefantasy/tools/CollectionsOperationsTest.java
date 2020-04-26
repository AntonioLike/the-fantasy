package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

class CollectionsOperationsTest {

	@Test
	void insertElementAtPosition() {
		List<Object> numbers = Arrays.asList(new Integer[] {0,2,3});
		CollectionsOperations.insertElementAtPosition(numbers,1,1);
		assertTrue(numbers.get(1)==Integer.valueOf(1));
	}

}
