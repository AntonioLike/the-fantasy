package com.github.antoniolike.thefantasy.model.beings;

public class Moving implements MovementState{

	@Override
	public MovementType action(Animal animal) {
		return MovementType.MOVING;				
	}

}
