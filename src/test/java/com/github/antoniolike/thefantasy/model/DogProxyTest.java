package com.github.antoniolike.thefantasy.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.antoniolike.thefantasy.model.beings.Dog;
import com.github.antoniolike.thefantasy.model.beings.DogProxy;
import com.github.antoniolike.thefantasy.model.beings.Speaker;

public class DogProxyTest {

	@Test
	public void testSpeaks() {
		Speaker dogProxy = new DogProxy();
		Dog dog = new Dog();
		assertEquals(dog.speaks(), dogProxy.speaks());
	}
	
}
