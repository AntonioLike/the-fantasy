package com.github.antoniolike.thefantasy.service;

import java.util.List;
import java.util.Random;

import com.github.antoniolike.thefantasy.model.occupation.Painter;

public class PainterService {
	
	List<Painter> painters;
	
	public void setPainters(List<Painter> painters) {
		this.painters = painters;
	}
	
	public Painter getPainter() {
		return painters.get(new Random().nextInt(painters.size()));		
	}
}
