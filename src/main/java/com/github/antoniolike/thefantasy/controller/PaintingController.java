package com.github.antoniolike.thefantasy.controller;

import com.github.antoniolike.thefantasy.factory.PaintingFactory;
import com.github.antoniolike.thefantasy.model.Color;
import com.github.antoniolike.thefantasy.model.Paintable;
import com.github.antoniolike.thefantasy.service.PainterService;

public class PaintingController {
	
	PainterService painterService;
	
	public void setPainterService(PainterService painterService) {
		this.painterService = painterService;
	}

	public void choosePaintingMethod(boolean paintType, Paintable paintable, Color color) {
		if(paintType)
			paintByMachine(paintable, color);
		paintManually(paintable,color);
	}
	
	private void paintByMachine(Paintable paintable, Color color) {
		PaintingFactory.getInstance().runPaintingMachine(paintable, color);
	}
	
	private void paintManually(Paintable paintable, Color color) {
		painterService.getPainter().works(paintable, color);
	}
}
