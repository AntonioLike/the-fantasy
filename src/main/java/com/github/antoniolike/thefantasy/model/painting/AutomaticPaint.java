package com.github.antoniolike.thefantasy.model.painting;

import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;

public class AutomaticPaint implements PaintingOrder{
	Paintable paintable;
	PaintingMachine paintingMachine;
	Cartridge cartridge;	
	
	public AutomaticPaint(Paintable paintable, PaintingMachine paintingMachine, Cartridge cartridge) {
		super();
		this.paintable = paintable;
		this.paintingMachine = paintingMachine;
		this.cartridge = cartridge;
	}

	@Override
	public void paints() {
		paintingMachine.initMachine(paintable, cartridge);
		
	}
	
}
