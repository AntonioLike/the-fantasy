package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Animal;
import com.github.antoniolike.thefantasy.model.beings.AnimalCollection;
import com.github.antoniolike.thefantasy.model.beings.Cat;
import com.github.antoniolike.thefantasy.model.beings.Dog;
import com.github.antoniolike.thefantasy.model.beings.Zoo;

public class ZooTest {
	
	@Test
	void getAnimalsTest() {
		String dogName = "dog";
		String catName = "cat";
		Animal dog = new Dog(dogName);
		Animal cat = new Cat(catName);
		AnimalCollection animalCollection = new AnimalCollection();
		animalCollection.add(dog);
		animalCollection.add(cat);
		Zoo zoo = new Zoo(animalCollection);
		assertEquals(dogName+","+catName,zoo.getAnimals());
		
		
	}
}
