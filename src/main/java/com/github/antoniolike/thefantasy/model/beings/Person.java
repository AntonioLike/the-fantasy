package com.github.antoniolike.thefantasy.model.beings;

import com.github.antoniolike.thefantasy.model.occupation.Occupation;
import com.github.antoniolike.thefantasy.model.occupation.Unemployed;
import com.github.antoniolike.thefantasy.model.painting.Color;

public class Person extends Animal{

	public Occupation<?,?> occupation;
	
	public Person() throws IllegalArgumentException {
		super();
	}

	public Person(String name, double weight) throws IllegalArgumentException {
		this(name,weight,new Unemployed());
	}	
	
	public Person(String name, double weight, Occupation<?, ?> occupation) throws IllegalArgumentException {
		super(name, weight, Color.NOCOLOR);
		this.occupation = occupation;
	}
	

}
