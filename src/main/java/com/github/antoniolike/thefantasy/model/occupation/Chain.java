package com.github.antoniolike.thefantasy.model.occupation;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	public String communicate(Message message);
	
}
