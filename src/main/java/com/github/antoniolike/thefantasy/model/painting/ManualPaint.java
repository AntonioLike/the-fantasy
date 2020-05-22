package com.github.antoniolike.thefantasy.model.painting;

import com.github.antoniolike.thefantasy.model.occupation.Painter;

public class ManualPaint implements PaintingOrder{
	Painter painter;
	Paintable paintable;
	Color color;

	public ManualPaint(Painter painter, Paintable paintable, Color color) {
		super();
		this.painter = painter;
		this.paintable = paintable;
		this.color = color;
	}

	@Override
	public void paints() {
		painter.works(paintable, color);		
	}
	
	

}
