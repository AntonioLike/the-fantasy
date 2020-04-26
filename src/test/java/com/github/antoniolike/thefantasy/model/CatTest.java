package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatTest {

	@Test
	void test() {
		String name = "test";
		Animal cat=null;
		try {
			cat = new Cat(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(cat instanceof Cat);
	}

}
