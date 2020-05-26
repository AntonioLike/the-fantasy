package com.github.antoniolike.thefantasy.factory;

import static org.junit.jupiter.api.Assertions.*;

import javax.management.InvalidAttributeValueException;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.occupation.Action;
import com.github.antoniolike.thefantasy.model.occupation.ActionableObject;
import com.github.antoniolike.thefantasy.model.occupation.EOccupation;
import com.github.antoniolike.thefantasy.model.occupation.Occupation;

class OccupationFactoryTest {

	@Test
	void testGetFlyOccupation() throws InvalidAttributeValueException {
		OccupationFactory of = OccupationFactory.getInstance();
		Occupation<ActionableObject, Action> p1 = of.getFlyOccupation(EOccupation.PAINTER); 
		Occupation<ActionableObject, Action> m1 = of.getFlyOccupation(EOccupation.MEDIC);
		
		Occupation<ActionableObject, Action> p2 = of.getFlyOccupation(EOccupation.PAINTER);
		Occupation<ActionableObject, Action> m2 = of.getFlyOccupation(EOccupation.MEDIC);
		
		assertEquals(p1, p2);
		assertEquals(m1, m2);
	}

}
