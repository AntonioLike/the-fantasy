package com.github.antoniolike.thefantasy.model.beings;

import com.github.antoniolike.thefantasy.model.occupation.ActionableObject;
import com.github.antoniolike.thefantasy.model.occupation.Occupation;
import com.github.antoniolike.thefantasy.model.occupation.Unemployed;
import com.github.antoniolike.thefantasy.model.painting.Color;

public class Person extends Animal implements ActionableObject{

	private Occupation<?,?> occupation;	
	
	public Person() throws IllegalArgumentException {
		super();
	}

	public Person(String name, double weight) throws IllegalArgumentException {
		this(name,weight,new Unemployed());
	}	
	
	public Person(String name, double weight, Occupation<?, ?> occupation) throws IllegalArgumentException {
		super(name, weight, Color.NOCOLOR);
		this.setOccupation(occupation);
	}

	public Occupation<?,?> getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation<?,?> occupation) {
		this.occupation = occupation;
	}
	

}
