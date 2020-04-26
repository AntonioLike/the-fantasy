package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void testAnimalString() {
		String name = "test";
		try {
			assertTrue(new Animal(name).getName().equals(name));
		
		assertThrows(Exception.class,()-> new Animal(null));
		assertThrows(Exception.class,()-> new Animal(""));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testAnimalStringDouble() {
		String name = "test";
		double weight = 10;
		Animal animal = null;
		try {
			animal = new Animal(name,weight);
		assertTrue(animal.getWeight()==weight);
		assertTrue(animal.getName().equals(name));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		assertThrows(Exception.class,()-> new Animal(name,0));
		assertThrows(Exception.class,()-> new Animal(name,-1));
		
	}
	
	@Test
	void testEats() {
		String name = "test";
		double weight = 10;
		Animal animal = null;
		try {
			animal = new Animal(name,weight);
		double mass = 5;
		try {
			animal.eat(mass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(animal.getWeight()==weight+mass);
		assertTrue(animal.getName().equals(name));
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	@Test
	void testExpels() {
		String name = "test";
		double weight = 10;
		
		final Animal animal;
		try {
			animal = new Animal(name,weight);
		double mass = 2;
		try {
			animal.expel(mass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(animal.getWeight()==weight-mass);
		try {
			animal.expel(-mass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(animal.getWeight()==weight-mass-mass);
	
		assertThrows(Exception.class,()-> animal.expel(animal.getWeight()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
