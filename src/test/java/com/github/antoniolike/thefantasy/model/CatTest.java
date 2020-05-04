package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Animal;
import com.github.antoniolike.thefantasy.model.beings.Cat;

class CatTest {

	@Test
	void test() {
		String name = "test";
		Animal cat=null;
		cat = new Cat(name);
		assertTrue(cat instanceof Cat);
	}

}
