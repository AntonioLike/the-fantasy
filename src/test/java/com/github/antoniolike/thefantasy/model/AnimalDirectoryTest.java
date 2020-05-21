package com.github.antoniolike.thefantasy.model;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.AnimalDirectory;
import com.github.antoniolike.thefantasy.model.beings.Cat;
import com.github.antoniolike.thefantasy.model.beings.Dog;

class AnimalDirectoryTest {

	@Test
	void speaksTest() {
		Dog dog = new Dog();
		Cat cat = new Cat();
		AnimalDirectory ad = new AnimalDirectory();
		ad.addAnimal(dog);
		ad.addAnimal(cat);
		
		ad.speaks();
	}

}
