package com.howtodoinjava.junit5.examples.ordering;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

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
