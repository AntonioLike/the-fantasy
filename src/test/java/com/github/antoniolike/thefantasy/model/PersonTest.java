package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.occupation.Painter;

class PersonTest {
	
	@Test
	void testPersonPainter() {
		String name = "Picasso";
		double weight = 65.0;
		Paintable wall = new Wall(Color.White);
		Color newColor = Color.Green;
		
		Painter picassoSkill = new Painter();
		Person picasso = new Person(name,weight,picassoSkill);
		((Painter)(picasso.occupation)).works(wall, newColor);
		
		assertEquals(newColor, wall.getColor());
	}
}
