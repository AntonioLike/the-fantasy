package com.github.antoniolike.thefantasy.model.painting;

import java.util.ArrayList;
import java.util.List;

import com.github.antoniolike.thefantasy.factory.FactoryProducer;
import com.github.antoniolike.thefantasy.model.painting.design.Cartridge;

public class PaintingHouse {
	private List<PaintingMachine> paintingMachines;
	private static PaintingHouse paintingFactory;
	private int nextMachine;
	private final int numberMachines = 10;
	private List <PaintingOrder> orders;
	
	private PaintingHouse() {
		nextMachine = 0;
		paintingMachines = new ArrayList<PaintingMachine>();
		orders = new ArrayList<PaintingOrder>();
		for(int i = 0; i< numberMachines; i++) {
			paintingMachines.add(new PaintingMachine());
		}
			
	}
	
	public static PaintingHouse getInstance() {
		if(paintingFactory == null)
			paintingFactory = new PaintingHouse();
		return paintingFactory;
	}
	
	public void addPaintingOrder(PaintingOrder order) {
		orders.add(order);
	}	
	
	public void runPaintingOrders() {
		for(PaintingOrder order : orders)
			order.paints();
		orders.clear();
	}
	
	public void runPaintingMachine(Paintable paintable, Cartridge cartridge) {
		PaintingMachine machine = paintingMachines.get(nextMachine);
		machine.initMachine(paintable,cartridge);
		nextMachine= nextMachine<numberMachines-1 ? nextMachine+1:0;
	}
	
	public void runPaintingMachine(Paintable paintable, Color color) {
		runPaintingMachine(paintable, FactoryProducer.getFactory(null).getCartridge(color));
	}
	
	
	
}
