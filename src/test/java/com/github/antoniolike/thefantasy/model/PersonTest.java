package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Person;
import com.github.antoniolike.thefantasy.model.occupation.Painter;
import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.Paintable;
import com.github.antoniolike.thefantasy.model.painting.Wall;

class PersonTest {
	
	@Test
	void testPersonPainter() {
		String name = "Picasso";
		double weight = 65.0;
		Paintable wall = new Wall(Color.WHITE);
		Color newColor = Color.GREEN;
		
		Painter picassoSkill = new Painter();
		Person picasso = new Person(name,weight,picassoSkill);
		((Painter)(picasso.getOccupation())).works(wall, newColor);
		
		assertEquals(newColor, wall.getColor());
	}
}
