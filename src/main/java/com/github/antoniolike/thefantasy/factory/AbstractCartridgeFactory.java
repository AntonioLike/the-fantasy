package com.github.antoniolike.thefantasy.factory;

import com.github.antoniolike.thefantasy.model.painting.Color;
import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;

public abstract class AbstractCartridgeFactory {
	public abstract Cartridge getCartridge(Color color);
}
