package com.github.antoniolike.thefantasy.factory;

import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;
import com.github.antoniolike.thefantasy.model.painting.design.Design;
import com.github.antoniolike.thefantasy.model.painting.Color;

public class SolidCartridgeFactory extends AbstractCartridgeFactory{

	@Override
	public Cartridge getCartridge(Color color) {
		return new Cartridge(color,Design.SOLID);
	}

}
