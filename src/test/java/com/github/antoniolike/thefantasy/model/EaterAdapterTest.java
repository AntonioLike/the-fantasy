package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Animal;
import com.github.antoniolike.thefantasy.model.beings.EaterAdapter;

class EaterAdapterTest {

	@Test
	void testEats() {
		Animal animal = new Animal();
		EaterAdapter adaptedEater = new EaterAdapter(animal);
		double initialWeight = animal.getWeight();
		Animal animalToBeEaten = new Animal("prey",10);
		adaptedEater.eats(animalToBeEaten);
		assertEquals(initialWeight + animalToBeEaten.getWeight(),animal.getWeight());
	}

}
