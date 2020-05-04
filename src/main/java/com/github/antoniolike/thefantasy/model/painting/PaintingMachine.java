package com.github.antoniolike.thefantasy.model.painting;

import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;

public class PaintingMachine extends Thread{
	
	Paintable paintable;
	Cartridge cartridge;
	
	private void paints() {
		paintable.setColor(cartridge.getColor());
		paintable.setDesign(cartridge.getDesign());
	}

	@Override
	public void run() {
		paints();	
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public void initMachine(Paintable paintable, Cartridge cartridge) {
		this.paintable = paintable;
		this.cartridge = cartridge;
		this.run();		
	}
}
