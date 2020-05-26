package com.github.antoniolike.thefantasy.model.beings;

public class Dialogue implements Runnable{
	private Person person1,person2;
	boolean speaker;
	String speech;
	
	public Dialogue(Person person1, Person person2,boolean firstSpeaker) {
		super();
		this.person1 = person1;
		this.person2 = person2;
		this.speaker= firstSpeaker;
	}
	
	public String speaks(boolean speaker) throws InterruptedException {
		if(this.speaker==speaker)
			run();
		else {
			this.speaker=speaker;
			run();
		}
		return speech;
	}
	
	@Override
	public void run() {
		if(speaker)
			speech = person1.speaks();
		else {
			speech = person2.speaks();			
		}
	}
}
