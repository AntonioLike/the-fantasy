package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.*;

import javax.management.InvalidAttributeValueException;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.factory.OccupationFactory;
import com.github.antoniolike.thefantasy.model.beings.Dialogue;
import com.github.antoniolike.thefantasy.model.beings.Person;
import com.github.antoniolike.thefantasy.model.occupation.EOccupation;

class DialogueTest {

	@Test
	void testSpeaks() throws InvalidAttributeValueException, IllegalArgumentException, InterruptedException {
		Person john = new Person("John",80.0,OccupationFactory.getInstance().getFlyOccupation(EOccupation.MEDIC));
		Person jane = new Person("Jane", 65, OccupationFactory.getInstance().getFlyOccupation(EOccupation.PAINTER));
		Dialogue dialogue = new Dialogue(john, jane, true);
		assertEquals(john.speaks(),dialogue.speaks(true));
		assertEquals(jane.speaks(),dialogue.speaks(false));
	}

}
