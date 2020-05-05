package com.github.antoniolike.thefantasy.model.occupation;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.github.antoniolike.thefantasy.model.beings.Person;

public class Unemployed implements Occupation<Person, String>,PropertyChangeListener {

	private int numberJobs = 0;
	
	@Override
	public void works(Person recruiter, String cv){
		FindJob(recruiter,cv);
	}

	private void FindJob(Person recruiter, String cv) {
		//TODO:	Create a service class	
	}
	
	public int getNumberJobs() {
		return numberJobs;
	}

	public void setNumberJobs(int numberJobs) {
		this.numberJobs = numberJobs;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		this.setNumberJobs((int) evt.getNewValue());
	}

}
