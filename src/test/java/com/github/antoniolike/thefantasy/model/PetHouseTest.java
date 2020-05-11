package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Cat;
import com.github.antoniolike.thefantasy.model.beings.Dog;
import com.github.antoniolike.thefantasy.model.beings.PetHouse;

class PetHouseTest {

	@Test
	void OnomatopoeizeTest () {
		PetHouse petHouse = new PetHouse();
		Cat cat = new Cat();
		Dog dog = new Dog();
		assertEquals(cat.speaks(), petHouse.meows());
		assertEquals(dog.speaks(), petHouse.barks());
	}

}
