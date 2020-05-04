package com.github.antoniolike.thefantasy.model.beings;

import com.github.antoniolike.thefantasy.model.painting.Color;

public class Animal implements Eater{
	private String name;
	private double weight;
	private Color color;

	public Animal() throws IllegalArgumentException{
		this("unnamed");
	}
	
	public Animal(String name) throws IllegalArgumentException {
		this(name, 1);
	}
	
	public Animal(String name, double weight) throws IllegalArgumentException {
		this(name,weight,Color.NOCOLOR);		
	}
	
	public Animal(String name, double weight, Color color) throws IllegalArgumentException{
		super();
		setName(name);
		setWeight(weight);
		setColor(color);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalArgumentException {
		if(name==null||name.length()==0)
			throw new IllegalArgumentException("The name can't be null or empty.");
		this.name = name;
	}

	

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) throws IllegalArgumentException {
		if(weight<=0)
			throw new IllegalArgumentException("Weight must be positive.");
		this.weight = weight;
	}

	

	@Override
	public void eat(double mass) throws IllegalArgumentException {
		setWeight(getWeight()+mass);
	}

	@Override
	public void expel(double mass) throws IllegalArgumentException {
		if(mass<=0)
			setWeight(getWeight()+mass);
		else
			setWeight(getWeight()-mass);
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	
	
}
