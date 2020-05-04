package com.github.antoniolike.thefantasy.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.occupation.Painter;
import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.Paintable;
import com.github.antoniolike.thefantasy.model.painting.Wall;
import com.github.antoniolike.thefantasy.model.painting.design.Design;
import com.github.antoniolike.thefantasy.service.PainterService;

class PaintingControllerTest {


	@Test
	void testChoosePaintingMethod() {
		PaintingController pc = new PaintingController();
		PainterService ps = new PainterService();
		List<Painter> painters = new ArrayList<Painter>();
		int nPainters = 10;
		for(int i=0;i<nPainters;i++) {
			painters.add(new Painter());
		}
		ps.setPainters(painters);
		pc.setPainterService(ps);
		
		boolean paintByMachine = true;
		Paintable paintable = new Wall(Color.NOCOLOR);
		Color color = Color.BLACK;
		Design design = Design.LINE;
		
		pc.choosePaintingMethod(paintByMachine, paintable, color, design);
		assertEquals(color, paintable.getColor());
		assertEquals(design, paintable.getDesign());
		
		color = Color.BLUE;
		Design newDesign = Design.SOLID;
		pc.choosePaintingMethod(!paintByMachine, paintable, color, newDesign);
		assertEquals(color, paintable.getColor());
		//Human Painter only changes color
		assertEquals(design, paintable.getDesign());
	}

}
