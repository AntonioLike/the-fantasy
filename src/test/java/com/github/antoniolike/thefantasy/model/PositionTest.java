package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.occupation.Chain;
import com.github.antoniolike.thefantasy.model.occupation.EPosition;
import com.github.antoniolike.thefantasy.model.occupation.Message;
import com.github.antoniolike.thefantasy.model.occupation.Messages;
import com.github.antoniolike.thefantasy.model.occupation.Position;

class PositionTest {

	@Test
	void chainResponsibilityTest() {
		Chain ceo = new Position(EPosition.CEO);
		Chain manager = new Position(EPosition.MANAGER);
		Chain professional = new Position(EPosition.PROFESSIONAL);
		
		professional.setNextChain(manager);
		manager.setNextChain(ceo);
		
		String msgP = "I need to speak to a professional";
		String msgM = "I need to speak to a manager";
		String msgC = "I need to speak to the CEO";
		String msgT = "I need to speak to a Trainee";
		
		Message msgToProfessional = new Message(msgP, EPosition.PROFESSIONAL);
		Message msgToManager = new Message(msgM, EPosition.MANAGER);
		Message msgToCeo = new Message(msgC, EPosition.CEO);
		Message msgToTrainee = new Message(msgT, EPosition.TRAINEE);
		
		assertEquals(Messages.getString("Position.0") + EPosition.PROFESSIONAL.toString().toLowerCase() + Messages.getString("Position.1") + msgP, professional.communicate(msgToProfessional));
		assertEquals(Messages.getString("Position.0") + EPosition.MANAGER.toString().toLowerCase() + Messages.getString("Position.1") + msgM, professional.communicate(msgToManager));
		assertEquals(Messages.getString("Position.0") + EPosition.CEO.toString().toLowerCase() + Messages.getString("Position.1") + msgC, professional.communicate(msgToCeo));
		assertThrows(InvalidParameterException.class, ()->professional.communicate(msgToTrainee));
		
	}

}
