package com.github.antoniolike.thefantasy.model.beings;

import java.io.InvalidClassException;
import java.lang.reflect.InvocationTargetException;

import com.github.antoniolike.thefantasy.model.painting.Color;

public class AnimalBuilder {
	private String name;
	private double weight;
	private Color color;
	private Class<?> species;
	
	public AnimalBuilder() {
	}
	
	public AnimalBuilder(String name, double weight, Color color, Class<?> species) throws InvalidClassException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
		setSpecies(species);
	}

	public AnimalBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public AnimalBuilder setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	public AnimalBuilder setColor(Color color) {
		this.color = color;
		return this;
	}
	
	public AnimalBuilder setSpecies(Class<?> species) throws InvalidClassException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if(!(species.getConstructor().newInstance() instanceof Animal))
			throw new InvalidClassException("The species is not an Animal");
		this.species = species;
		return this;
	}

	public Animal build() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		return (Animal) ((Class<?>) species).getConstructor(String.class,double.class,Color.class).newInstance(name,weight,color);
	}
	
		
}
