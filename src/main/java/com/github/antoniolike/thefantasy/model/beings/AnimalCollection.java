package com.github.antoniolike.thefantasy.model.beings;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalCollection extends ArrayList<Animal> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public Iterator<Animal> iterator() {
		return new AnimalIterator(this);
	}

}
