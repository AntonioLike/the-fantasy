package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void testAnimalString() {
		String name = "test";

		assertTrue(new Animal(name).getName().equals(name));

		assertThrows(IllegalArgumentException.class,()-> new Animal(null));
		assertThrows(IllegalArgumentException.class,()-> new Animal(""));

	}

	@Test
	void testAnimalStringDouble() {
		String name = "test";
		double weight = 10;
		Animal animal = null;

		animal = new Animal(name,weight);
		assertTrue(animal.getWeight()==weight);
		assertTrue(animal.getName().equals(name));


		assertThrows(IllegalArgumentException.class,()-> new Animal(name,0));
		assertThrows(IllegalArgumentException.class,()-> new Animal(name,-1));

	}

	@Test
	void testEats() {
		String name = "test";
		double weight = 10;
		Animal animal = null;
		animal = new Animal(name,weight);
		double mass = 5;
		animal.eat(mass);
		assertTrue(animal.getWeight()==weight+mass);
		assertTrue(animal.getName().equals(name));


	}

	@Test
	void testExpels() {
		String name = "test";
		double weight = 10;

		final Animal animal;

		animal = new Animal(name,weight);
		double mass = 2;
		animal.expel(mass);

		assertTrue(animal.getWeight()==weight-mass);

		animal.expel(-mass);
		assertTrue(animal.getWeight()==weight-mass-mass);

		assertThrows(IllegalArgumentException.class,()-> animal.expel(animal.getWeight()));

	}

	@Test
	void testAnimalStringDoubleColor() {
		String name = "test";
		double weight = 10;
		Animal animal = null;

		animal = new Animal(name,weight,Color.NoColor);
		assertTrue(animal.getWeight()==weight);
		assertTrue(animal.getName().equals(name));
		assertTrue(animal.getColor().equals(Color.NoColor));
	}

}
