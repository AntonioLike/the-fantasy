package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	@Test
	void Dog() {
		String name = "test";
		Animal dog = null;
		try {
			dog = new Dog(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(dog instanceof Dog);	}

}
