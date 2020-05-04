package com.github.antoniolike.thefantasy.factory;

import com.github.antoniolike.thefantasy.model.painting.design.Design;

public class FactoryProducer {
	public static AbstractCartridgeFactory getFactory(Design design) {
		if(design == null)
			return new SolidCartridgeFactory();
		switch (design) {
		case LINE:
			return new LineCartridgeFactory();
		default:
			return new SolidCartridgeFactory(); 
		}
	}
}
