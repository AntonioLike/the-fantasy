package com.github.antoniolike.thefantasy.model.beings;

import java.util.Iterator;

public class Zoo {
	AnimalCollection animals;
	
	public Zoo(AnimalCollection animals) {
		this.animals = animals;
	}
	
	public String getAnimals() {
		Iterator<Animal> iterator = animals.iterator();
		StringBuilder sb = new StringBuilder();
		while(iterator.hasNext()) {
			sb.append(iterator.next()).append(",");
		}
		sb.setLength(Math.max(sb.length() - 1, 0));
		return sb.toString();	
	}
}
