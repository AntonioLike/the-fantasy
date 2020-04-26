package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

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
	
	@Test
	void testMaxDoubleArray() {
		assertTrue(ArraysOperations.max(new double[]{1.1,-3,-5.5})==1.1);
	}
	
	@Test
	void testMinDoubleArray() {
		assertTrue(ArraysOperations.min(new double[]{1.1,-3,-5.5})==-5.5);
	}
}
