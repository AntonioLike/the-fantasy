package com.github.antoniolike.thefantasy.model.occupation;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class EmploymentCenter {
	private List<Job> jobs;
	private int numberJobs;
	
	public List<Job> getJobs() {
		return jobs;
	}

	public int getNumberJobs() {
		return numberJobs;
	}

	public void setNumberJobs(int numberJobs) {
		this.numberJobs = numberJobs;
	}

	private PropertyChangeSupport support;
	private static EmploymentCenter employmentCenter;
	
	private EmploymentCenter() {
		support = new PropertyChangeSupport(this);
		jobs = new ArrayList<Job>();
		numberJobs = 0;
	}
	
	public static EmploymentCenter getInstance() {
		if(employmentCenter == null)
			employmentCenter= new EmploymentCenter();
		return employmentCenter;
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	
	public void addJobs(Job ... jobs) {
		for(Job job:jobs) 			
			this.jobs.add(job);
		support.firePropertyChange("numberJobs",this.numberJobs,this.jobs.size());
		setNumberJobs(this.jobs.size());
	}
	
	public void removeJobs(Job ...jobs) {
		for(Job job:jobs) 
			this.jobs.remove(job);
		support.firePropertyChange("numberJobs",this.numberJobs,this.jobs.size());
		setNumberJobs(this.jobs.size());
	}
	
	public void removeJobs(int ...jobs) {
		for(int job:jobs) 
			this.jobs.remove(job);
		support.firePropertyChange("numberJobs",this.numberJobs,this.jobs.size());
		setNumberJobs(this.jobs.size());
	}
}
