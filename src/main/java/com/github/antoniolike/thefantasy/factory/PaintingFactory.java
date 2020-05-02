package com.github.antoniolike.thefantasy.factory;

import java.util.ArrayList;
import java.util.List;

import com.github.antoniolike.thefantasy.model.Color;
import com.github.antoniolike.thefantasy.model.Paintable;
import com.github.antoniolike.thefantasy.model.PaintingMachine;

public class PaintingFactory {
	private List<PaintingMachine> paintingMachines;
	private static PaintingFactory paintingFactory;
	private int nextMachine;
	private final int numberMachines = 10;
	
	private PaintingFactory() {
		nextMachine = 0;
		paintingMachines = new ArrayList<PaintingMachine>();
		for(int i = 0; i< numberMachines; i++) {
			paintingMachines.add(new PaintingMachine());
		}
			
	}
	
	public static PaintingFactory getInstance() {
		if(paintingFactory == null)
			paintingFactory = new PaintingFactory();
		return paintingFactory;
	}
	
	public void runPaintingMachine(Paintable paintable, Color color) {
		PaintingMachine machine = paintingMachines.get(nextMachine);
		machine.initMachine(paintable,color);
		nextMachine= nextMachine<numberMachines-1 ? nextMachine+1:0;
	}
	
	
	
}
