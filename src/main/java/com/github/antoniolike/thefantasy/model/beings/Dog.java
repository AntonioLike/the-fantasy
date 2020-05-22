package com.github.antoniolike.thefantasy.model.beings;

import com.github.antoniolike.thefantasy.model.painting.Color;

public class Dog extends Animal implements Pet{

	public Dog() {
		super();
	}
	
	public Dog(String name) throws IllegalArgumentException {
		super(name);
	}

	public Dog(String name, double weight) {
		super(name,weight);
	}

	public Dog(String name, double weight, Color color) {
		super(name,weight,color);
	}

	@Override
	public String speaks() {
		return "bark";
	}

}
