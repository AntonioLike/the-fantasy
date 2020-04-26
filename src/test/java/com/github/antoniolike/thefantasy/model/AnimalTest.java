package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void testAnimal() {
		String name = "test";
		assertTrue(new Animal(name).getName().equals(name));
	}

}
