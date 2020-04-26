package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void testAnimalString() {
		String name = "test";
		assertTrue(new Animal(name).getName().equals(name));
	}
	
	@Test
	void testAnimalStringDouble() {
		String name = "test";
		double weight = 15;
		Animal animal = new Animal(name, weight);
		assertTrue(animal.getName().equals(name));
		assertTrue(animal.getWeight()==weight);
	}
	
	@Test
	void testEats() {
		String name = "test";
		double weight = 15;
		Animal animal = new Animal(name, weight);
		double mass = 5;
		animal.Eat(mass);
		assertTrue(animal.getWeight()==weight+mass);
	}
	
	@Test
	void testExpels() {
		String name = "test";
		double weight = 15;
		Animal animal = new Animal(name, weight);
		double mass = 5;
		animal.Expels(mass);
		assertTrue(animal.getWeight()==weight-mass);
	}
}
