package com.github.antoniolike.thefantasy.model.occupation;

import java.security.InvalidParameterException;

public class Position implements Chain{

	private Chain nextChain;
	private EPosition position;
	
	public Position(EPosition position) {
		this.position =  position;
	}

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;		
	}

	@Override
	public String communicate(Message message) {
		if(this.position.equals(message.getPosition()))
			return Messages.getString("Position.0") + position.toString().toLowerCase() + Messages.getString("Position.1") + message.getMessage(); //$NON-NLS-1$ //$NON-NLS-2$
		else
			if(nextChain == null) {
				throw new InvalidParameterException(Messages.getString("Position.2")); //$NON-NLS-1$
			}
			return nextChain.communicate(message);
	}
	

}
