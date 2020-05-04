package com.github.antoniolike.thefantasy.model.occupation;

import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.Paintable;

public class Painter implements Occupation<Paintable, Color>{
	@Override
	public void works(Paintable paintable, Color newColor) {
		paints(paintable,newColor);
	}

	private void paints(Paintable paintable, Color newColor) {
		paintable.setColor(newColor);
	}
	

	
}
