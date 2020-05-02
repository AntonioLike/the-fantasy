package com.github.antoniolike.thefantasy.factory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.Color;
import com.github.antoniolike.thefantasy.model.Paintable;
import com.github.antoniolike.thefantasy.model.Wall;

class PaintingFactoryTest {

	@Test
	void testRunPaintingMachine() {
		PaintingFactory pF = PaintingFactory.getInstance();
		int numberPaintables = 1000;
		Color initialColor = Color.Black;
		Color newColor = Color.White;
		List<Paintable> paintables = new ArrayList<Paintable>(numberPaintables);
		for(int i = 0; i< numberPaintables;i++) 
			paintables.add(new Wall(initialColor));	
		
		for(Paintable paintable:paintables) 
			pF.runPaintingMachine(paintable, newColor);
		
		for(Paintable paintable:paintables)
			assertEquals(newColor, paintable.getColor());
	}

}
