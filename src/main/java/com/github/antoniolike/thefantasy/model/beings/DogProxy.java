package com.github.antoniolike.thefantasy.model.beings;

public class DogProxy implements Speaker{
	private static Speaker dog;

	@Override
	public String speaks() {
		if(dog == null)
			dog = new Dog();
		return dog.speaks();
	}
	
	

}
