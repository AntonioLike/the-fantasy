package com.github.antoniolike.thefantasy.model;

public class Wall implements Paintable{
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Wall(Color color) {
		super();
		this.color = color;
	}
	
}
