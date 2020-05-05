package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.occupation.EmploymentCenter;
import com.github.antoniolike.thefantasy.model.occupation.Job;
import com.github.antoniolike.thefantasy.model.occupation.Unemployed;

class EmploymentCenterTest {
	
	@Test
	void PropertyChangeTest() {
		EmploymentCenter ec = EmploymentCenter.getInstance();
		Unemployed unemployed = new Unemployed();
		
		ec.addPropertyChangeListener(unemployed);
		ec.addJobs(new Job());
		
		assertEquals(ec.getNumberJobs(), unemployed.getNumberJobs());
	}
}
