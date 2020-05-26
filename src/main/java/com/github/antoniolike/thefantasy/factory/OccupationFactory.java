package com.github.antoniolike.thefantasy.factory;

import java.util.HashMap;
import java.util.Map;

import javax.management.InvalidAttributeValueException;

import com.github.antoniolike.thefantasy.model.occupation.Action;
import com.github.antoniolike.thefantasy.model.occupation.ActionableObject;
import com.github.antoniolike.thefantasy.model.occupation.EOccupation;
import com.github.antoniolike.thefantasy.model.occupation.Medic;
import com.github.antoniolike.thefantasy.model.occupation.Occupation;
import com.github.antoniolike.thefantasy.model.occupation.Painter;
import com.github.antoniolike.thefantasy.model.occupation.Unemployed;

public class OccupationFactory {
	private Map<EOccupation, Occupation<ActionableObject, Action>> occupations = new HashMap<EOccupation, Occupation<ActionableObject,Action>>();
	private static OccupationFactory instance;
	
	private OccupationFactory() {
		
	}
	
	public static OccupationFactory getInstance() {
		if(instance==null)
			instance = new OccupationFactory();
		return instance;
	}
	
	public Occupation<ActionableObject, Action> getFlyOccupation(EOccupation occupationType) throws InvalidAttributeValueException{
		if(occupations.containsKey(occupationType))
			return occupations.get(occupationType);
		else {
			@SuppressWarnings("unchecked")
			Occupation<ActionableObject, Action> newOccupation = (Occupation<ActionableObject, Action>) getConcreteOccupation(occupationType);
			occupations.put(occupationType, newOccupation);
			return newOccupation;			
		}
			
	}
	
	private Occupation<?, ?> getConcreteOccupation(EOccupation occupationType) throws InvalidAttributeValueException{
		switch (occupationType) {
		case MEDIC:
			return new Medic();
		case PAINTER:
			return new Painter();
		case UNEMPLOYED:
			return new Unemployed();
		default:
			throw new InvalidAttributeValueException("This type of occupation doesn't exist");
		}
	}
	
	
}
