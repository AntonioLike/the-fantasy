package com.github.antoniolike.thefantasy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.tools.ArraysOperations;

class ArraysOperationsTest {

	@Test
	void testProductArray() {
		int array[] = new int[] {1,2,3,4};
		assertTrue(Arrays.equals(ArraysOperations.productArray(array),(new int[] {24,12,8,6})));
	}

	@Test
	void testSort() {
		int array[] = new int[] {3,5,2,1};
		ArraysOperations.sort(array);
		assertTrue(Arrays.equals(array,new int[]{1,2,3,5}));
	}

}
