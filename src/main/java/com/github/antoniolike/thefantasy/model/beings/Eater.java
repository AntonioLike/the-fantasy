package com.github.antoniolike.thefantasy.model.beings;

public interface Eater {
	public void eat(double mass) throws IllegalArgumentException;
	public void expel(double mass) throws IllegalArgumentException;
}
