package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.painting.AutomaticPaint;
import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.Paintable;
import com.github.antoniolike.thefantasy.model.painting.PaintingHouse;
import com.github.antoniolike.thefantasy.model.painting.PaintingMachine;
import com.github.antoniolike.thefantasy.model.painting.PaintingOrder;
import com.github.antoniolike.thefantasy.model.painting.Wall;
import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;
import com.github.antoniolike.thefantasy.model.painting.design.Design;

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
	
	@Test
	void test() {
		PaintingHouse ph = PaintingHouse.getInstance();
		
		Color color1 = Color.WHITE;
		Design design1 = Design.SOLID;
		Color color2 = Color.RED;
		Design design2 = Design.LINE;
		
		Paintable p1 = new Wall(color1, design1);
		PaintingMachine m1 = new PaintingMachine();
		Cartridge c1 = new Cartridge(color2, design2);
		PaintingOrder o1 = new AutomaticPaint(p1,m1,c1);
		ph.addPaintingOrder(o1);
		
		Paintable p2 = new Wall(color1, design1);
		PaintingMachine m2 = new PaintingMachine();
		Cartridge c2 =new Cartridge(color2, design2);
		PaintingOrder o2 = new AutomaticPaint(p2,m2,c2);
		ph.addPaintingOrder(o2);
		
		Paintable p3 =  new Wall(color1, design1);
		PaintingMachine m3 = new PaintingMachine();
		Cartridge c3 = new Cartridge(color2, design2);
		PaintingOrder o3 = new AutomaticPaint(p3,m3,c3);
		ph.addPaintingOrder(o3);
		
		ph.runPaintingOrders();		
		
		assertEquals(color2, p1.getColor());
		assertEquals(design2, p1.getDesign());
		
		assertEquals(color2, p2.getColor());
		assertEquals(design2, p2.getDesign());

		assertEquals(color2, p3.getColor());
		assertEquals(design2, p3.getDesign());

	}
	

}
