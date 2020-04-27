package com.github.antoniolike.thefantasy.model;

public class Animal implements Eater{
	private String name;
	private double weight;
	private Color color;

	public Animal(String name) throws Exception {
		this(name, 1);
	}
	
	public Animal(String name, double weight) throws Exception {
		this(name,weight,Color.values()[0]);		
	}
	
	public Animal(String name, double weight, Color color) throws Exception{
		super();
		setName(name);
		setWeight(weight);
		setColor(color);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if(name==null||name.length()==0)
			throw new Exception("The name can't be null or empty.");
		this.name = name;
	}

	

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) throws Exception {
		if(weight<=0)
			throw new Exception("Weight must be positive.");
		this.weight = weight;
	}

	

	@Override
	public void eat(double mass) throws Exception {
		setWeight(getWeight()+mass);
	}

	@Override
	public void expel(double mass) throws Exception {
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
