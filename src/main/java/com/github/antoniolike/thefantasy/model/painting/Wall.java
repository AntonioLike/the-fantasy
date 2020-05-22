package com.github.antoniolike.thefantasy.model.painting;

import com.github.antoniolike.thefantasy.model.painting.design.Design;

public class Wall implements Paintable{
	private Color color;
	private Design design;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Wall(Color color) {
		this(color,Design.SOLID);
	}

	public Wall(Color color, Design design) {
		super();
		this.color = color;
		this.design = design;
	}
	
	public Wall() {
		this(Color.WHITE);
	}

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}
	
}
