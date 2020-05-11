package com.github.antoniolike.thefantasy.model.beings;

import com.github.antoniolike.thefantasy.model.painting.Color;

public class Cat extends Animal {

	public Cat() {
		super();
	}
	
	public Cat(String name) throws IllegalArgumentException {
		super(name);
	}

	public Cat(String name, double weight) {
		super(name,weight);
	}
	
	public Cat(String name, double weight, Color color) {
		super(name,weight,color);
	}

	@Override
	public String speaks() {
		return "meow";
	}

}
