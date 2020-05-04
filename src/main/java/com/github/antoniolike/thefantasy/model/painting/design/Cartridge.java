package com.github.antoniolike.thefantasy.model.painting.design;

import com.github.antoniolike.thefantasy.model.painting.Color;

public class Cartridge {
	
	private Color color;
	private Design design;
	
	public Cartridge(Color color, Design design) {
		super();
		this.setColor(color);
		this.setDesign(design);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}


}
