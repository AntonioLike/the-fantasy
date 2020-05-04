package com.github.antoniolike.thefantasy.controller;

import com.github.antoniolike.thefantasy.factory.FactoryProducer;
import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.Paintable;
import com.github.antoniolike.thefantasy.model.painting.PaintingHouse;
import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;
import com.github.antoniolike.thefantasy.model.painting.design.Design;
import com.github.antoniolike.thefantasy.service.PainterService;

public class PaintingController {
	
	PainterService painterService;
	
	public void setPainterService(PainterService painterService) {
		this.painterService = painterService;
	}

	public void choosePaintingMethod(boolean paintType, Paintable paintable, Color color, Design design) {
		if(paintType)
			paintByMachine(paintable, FactoryProducer.getFactory(design).getCartridge(color));
		paintManually(paintable,color);
	}
	
	private void paintByMachine(Paintable paintable, Cartridge cartridge) {
		PaintingHouse.getInstance().runPaintingMachine(paintable, cartridge);
	}
	
	private void paintManually(Paintable paintable, Color color) {
		painterService.getPainter().works(paintable, color);
	}
}
