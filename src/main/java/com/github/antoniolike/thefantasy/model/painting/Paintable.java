package com.github.antoniolike.thefantasy.model.painting;

import com.github.antoniolike.thefantasy.model.occupation.ActionableObject;
import com.github.antoniolike.thefantasy.model.painting.design.Design;

public interface Paintable extends ActionableObject{
	Color getColor();
	void setColor(Color color);
	void setDesign(Design design);
	Design getDesign();
}
