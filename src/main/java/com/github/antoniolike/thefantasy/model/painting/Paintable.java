package com.github.antoniolike.thefantasy.model.painting;

import com.github.antoniolike.thefantasy.model.painting.design.Design;

public interface Paintable {
	Color getColor();
	void setColor(Color color);
	void setDesign(Design design);
	Design getDesign();
}
