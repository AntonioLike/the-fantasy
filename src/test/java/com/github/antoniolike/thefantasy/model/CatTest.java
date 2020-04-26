package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatTest {

	@Test
	void test() {
		String name = "test";
		assertTrue(new Cat(name).getName().equals(name));
	}

}
