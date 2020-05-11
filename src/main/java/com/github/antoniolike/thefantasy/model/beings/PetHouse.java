package com.github.antoniolike.thefantasy.model.beings;

public class PetHouse {
	private Cat cat;
	private Dog dog;
	
	public PetHouse() {
		this(new Cat(), new Dog());
	}
	public PetHouse(Cat cat, Dog dog) {
		this.cat = cat;
		this.dog = dog;
	}
	
	public String meows() {
		return cat.speaks();
	}
	
	public String barks() {
		return dog.speaks();
	}
}
