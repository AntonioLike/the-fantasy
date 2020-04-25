package com.github.antoniolike.thefantasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.tools.StringOperations;

class StringOperationsTest {

	@Test
	void testAreAnadromes() {
		assertFalse(StringOperations.areAnadromes("abc", "bda"));
		assertTrue(StringOperations.areAnadromes("co-!md", "o!dm-c"));
	}

	@Test
	void testArePalindromes() {
		assertFalse(StringOperations.arePalindromes("abc", "cbb"));
		assertTrue(StringOperations.arePalindromes("abc", "cba"));
	}
	
	@Test
	void arePalindromesIgnoreNonAlphaNumeric() {
		assertFalse(StringOperations.arePalindromesIgnoreNonAlphaNumeric("ads", "das1"));
		assertTrue(StringOperations.arePalindromesIgnoreNonAlphaNumeric("ab!1<@£§1  ", "11ba-"));
	}

}
