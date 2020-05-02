package com.github.antoniolike.thefantasy.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.Color;
import com.github.antoniolike.thefantasy.model.Paintable;
import com.github.antoniolike.thefantasy.model.Wall;
import com.github.antoniolike.thefantasy.model.occupation.Painter;
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
		
		boolean paintType = true;
		Paintable paintable = new Wall(Color.NoColor);
		Color color = Color.Black;
		
		pc.choosePaintingMethod(paintType, paintable, color);
		assertEquals(color, paintable.getColor());
		
		color = Color.Blue;
		pc.choosePaintingMethod(!paintType, paintable, color);
		assertEquals(color, paintable.getColor());
	}

}
