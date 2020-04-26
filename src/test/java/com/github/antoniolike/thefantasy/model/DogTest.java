package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	@Test
	void Dog() {
		String name = "test";
		assertTrue(new Dog(name).getName().equals(name));
	}

}
