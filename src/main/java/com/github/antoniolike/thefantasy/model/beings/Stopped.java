package com.github.antoniolike.thefantasy.model.beings;

public class Stopped implements MovementState {

	@Override
	public MovementType action(Animal animal) {
		return MovementType.STOPPED;		
	}

}
