package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Animal;
import com.github.antoniolike.thefantasy.model.beings.Cat;
import com.github.antoniolike.thefantasy.model.beings.Dog;
import com.github.antoniolike.thefantasy.model.beings.MovementType;
import com.github.antoniolike.thefantasy.model.beings.Moving;
import com.github.antoniolike.thefantasy.model.beings.Stopped;
import com.github.antoniolike.thefantasy.model.painting.Color;

class AnimalTest {

	@Test
	void testAnimalString() {
		String name = "test";

		assertTrue(new Dog(name).getName().equals(name));

		assertThrows(IllegalArgumentException.class,()-> new Cat(null));
		assertThrows(IllegalArgumentException.class,()-> new Cat(""));

	}

	@Test
	void testAnimalStringDouble() {
		String name = "test";
		double weight = 10;
		Animal animal = null;

		animal = new Dog(name,weight);
		assertTrue(animal.getWeight()==weight);
		assertTrue(animal.getName().equals(name));


		assertThrows(IllegalArgumentException.class,()-> new Dog(name,0));
		assertThrows(IllegalArgumentException.class,()-> new Cat(name,-1));

	}

	@Test
	void testEats() {
		String name = "test";
		double weight = 10;
		Animal animal = null;
		animal = new Dog(name,weight);
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

		animal = new Cat(name,weight);
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

		animal = new Dog(name,weight,Color.NOCOLOR);
		assertTrue(animal.getWeight()==weight);
		assertTrue(animal.getName().equals(name));
		assertTrue(animal.getColor().equals(Color.NOCOLOR));
	}
	
	@Test
	void testMove() {
		Dog dog = new Dog();
		assertEquals(MovementType.STOPPED, dog.move());
		dog.setState(new Moving());
		assertEquals(MovementType.MOVING, dog.move());
		dog.setState(new Stopped());
		assertEquals(MovementType.STOPPED, dog.move());
	}

}
