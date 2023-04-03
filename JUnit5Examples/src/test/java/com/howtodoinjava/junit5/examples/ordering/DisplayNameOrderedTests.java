package com.howtodoinjava.junit5.examples.ordering;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO: lancer les tests selon l'ordre numérique
public class DisplayNameOrderedTests
{
	@DisplayName("5")
	@Test
	void testE() {
		assertTrue(true);
	}

	@DisplayName("3")
	@Test
	void testA() {
		assertTrue(true);
	}

	@DisplayName("1")
	@Test
	void testD() {
		assertTrue(true);
	}

	@DisplayName("2")
	@Test
	void testC() {
		assertTrue(true);
	}

	@DisplayName("4")
	@Test
	void testB() {
		assertTrue(true);
	}
}
