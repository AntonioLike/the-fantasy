package com.github.antoniolike.thefantasy.model.beings;

import java.util.ArrayList;
import java.util.List;
import com.github.antoniolike.thefantasy.tools.StringOperations;

public class AnimalDirectory extends Animal {

	List<Animal> animalDirectory = new ArrayList<Animal>();
	
	@Override
	public String speaks() {
		List<String> speeches = new ArrayList<String>();
		for(Animal animal : animalDirectory)
			speeches.add(animal.speaks());
		return StringOperations.concatenateStringsDelimitator(" ,",speeches.toArray(new String[0]));
	}

	
	public void addAnimal(Animal animal) {
		animalDirectory.add(animal);
	}
	
	public void removeAnimal(Animal animal) {
		animalDirectory.remove(animal);
	}
	
}
