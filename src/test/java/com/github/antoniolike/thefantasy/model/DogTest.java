package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Animal;
import com.github.antoniolike.thefantasy.model.beings.Dog;

class DogTest {

	@Test
	void Dog() {
		String name = "test";
		Animal dog = null;

		dog = new Dog(name);
		assertTrue(dog instanceof Dog);	}

}
