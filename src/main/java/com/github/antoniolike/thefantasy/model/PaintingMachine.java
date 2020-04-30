package com.github.antoniolike.thefantasy.model;

public class PaintingMachine extends Thread{
	
	Paintable paintable;
	Color color;
	
	private void paints() {
		paintable.setColor(color);
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

	public void initMachine(Paintable paintable, Color color) {
		this.paintable = paintable;
		this.color = color;
		this.run();		
	}
}
