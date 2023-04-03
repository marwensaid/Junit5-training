package com.howtodoinjava.junit5.examples.ordering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO: lancer avec l'ordre alphabétique
public class MethodNameOrderedTests 
{
	@Test
	void testE() {
		assertTrue(true);
	}

	@Test
	void testA() {
		assertTrue(true);
	}

	@Test
	void testD() {
		assertTrue(true);
	}

	@Test
	void testC() {
		assertTrue(true);
	}

	@Test
	void testB() {
		assertTrue(true);
	}
}
