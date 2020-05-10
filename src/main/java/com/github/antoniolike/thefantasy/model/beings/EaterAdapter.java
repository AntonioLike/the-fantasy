package com.github.antoniolike.thefantasy.model.beings;

public class EaterAdapter implements AnimalEater{
	
	private Eater eater;
	
	public EaterAdapter(Eater eater) {
		super();
		this.eater = eater;
	}
	
	@Override
	public void eats(Animal animal) {
		eater.eat(animal.getWeight());
	}
	
}
