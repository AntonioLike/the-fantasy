package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	
	@Test
	void concatenateStringsTest() {
		assertEquals("This is just a test!",StringOperations.concatenateStrings(new String[] {"This ", "is ", "just ", "a test!"}));
		assertEquals("a test",StringOperations.concatenateStrings("a ", "test"));
		assertEquals("test",StringOperations.concatenateStrings("test"));
	}
}
