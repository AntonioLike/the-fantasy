package com.github.antoniolike.thefantasy.model.occupation;

import com.github.antoniolike.thefantasy.model.Person;

public class Unemployed implements Occupation<Person, String> {

	@Override
	public void works(Person recruiter, String cv){
		FindJob(recruiter,cv);
	}

	private void FindJob(Person recruiter, String cv) {
		//TODO:	Create a service class	
	}

}
