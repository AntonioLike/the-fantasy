package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.Paintable;
import com.github.antoniolike.thefantasy.model.painting.PaintingHouse;
import com.github.antoniolike.thefantasy.model.painting.Wall;

class PaintingHouseTest {

	@Test
	void testRunPaintingMachine() {
		PaintingHouse pF = PaintingHouse.getInstance();
		int numberPaintables = 1000;
		Color initialColor = Color.BLACK;
		Color newColor = Color.WHITE;
		List<Paintable> paintables = new ArrayList<Paintable>(numberPaintables);
		for(int i = 0; i< numberPaintables;i++) 
			paintables.add(new Wall(initialColor));	
		
		for(Paintable paintable:paintables) 
			pF.runPaintingMachine(paintable, newColor);
		
		for(Paintable paintable:paintables)
			assertEquals(newColor, paintable.getColor());
	}

}
