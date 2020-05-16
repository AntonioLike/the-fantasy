package com.github.antoniolike.thefantasy.model.beings;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator implements Iterator<Animal> {

	List<Animal> animals;
	int pos = 0;
	
	public AnimalIterator(List<Animal> animals) {
		super();
		this.animals = animals;
	}

	@Override
	public boolean hasNext() {
		return pos>=animals.size()?false:true;
	}

	@Override
	public Animal next() {
		return animals.get(pos++);
	}

}
