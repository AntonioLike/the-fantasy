package com.github.antoniolike.thefantasy.model;

public class Animal implements Eats{
	private String name;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		this(name, 1);
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Animal(String name, double weight) {
		super();
		setName(name);
		setWeight(weight);;
	}

	@Override
	public void eat(double mass) {
		setWeight(getWeight()+mass);
	}

	@Override
	public void expel(double mass) {
		if(mass<=0)
			setWeight(getWeight()+mass);
		else
			setWeight(getWeight()-mass);
		
	}
	
	
}
