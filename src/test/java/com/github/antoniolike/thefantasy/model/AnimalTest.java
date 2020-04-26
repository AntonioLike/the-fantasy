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
		double weight = 10;
		Animal animal = new Animal(name,weight);
		assertTrue(animal.getWeight()==weight);
		assertTrue(animal.getName().equals(name));
	}
	
	@Test
	void testEats() {
		String name = "test";
		double weight = 10;
		Animal animal = new Animal(name,weight);
		double mass = 5;
		animal.eat(mass);
		assertTrue(animal.getWeight()==weight+mass);
		assertTrue(animal.getName().equals(name));
	}
	
	@Test
	void testExpels() {
		String name = "test";
		double weight = 10;
		Animal animal = new Animal(name,weight);
		double mass = 2;
		animal.expel(mass);
		assertTrue(animal.getWeight()==weight-mass);
		animal.expel(-mass);
		assertTrue(animal.getWeight()==weight-mass-mass);
		
	}

}
