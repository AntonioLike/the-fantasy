package com.github.antoniolike.thefantasy.model;

public class Animal implements Eats{
	private String name;
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public Animal(String name) {
		this(name,1);
	}

	@Override
	public void Eat(double mass) {
		
		setWeight(getWeight()+mass);
	}

	@Override
	public void Expels(double mass) {
		if(mass<=0)
			setWeight(getWeight()+mass);
		else
			setWeight(getWeight()-mass);
	}
		
}
