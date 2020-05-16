package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.InvalidClassException;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Animal;
import com.github.antoniolike.thefantasy.model.beings.AnimalBuilder;
import com.github.antoniolike.thefantasy.model.beings.Dog;
import com.github.antoniolike.thefantasy.model.painting.Color;

class AnimalBuilderTest {


	@Test
	void testSetSpecies() {
		AnimalBuilder abException = new AnimalBuilder();
		Class<?> object = Object.class;
		
		assertThrows(InvalidClassException.class, ()->abException.setSpecies(object));
	}
	
	@Test
	void testBuild() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InvalidClassException {
		String name = "Dog";
		double weight = 5;
		Color color = Color.NOCOLOR;
		Class<?> species = Dog.class;
		
		AnimalBuilder ab = new AnimalBuilder(name, weight, color,species);
		Animal animal = ab.build();
		
		assertEquals(species,animal.getClass());
		assertEquals(name, animal.getName());
		assertEquals(weight, animal.getWeight());
		assertEquals(color, animal.getColor());	
		
	}

}
