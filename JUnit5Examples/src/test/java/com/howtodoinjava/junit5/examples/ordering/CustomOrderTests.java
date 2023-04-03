package com.howtodoinjava.junit5.examples.ordering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO: lancer les tests "deprecated" en dernier
public class CustomOrderTests {
	@Test
	@Deprecated
	void testC() {
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
	@Deprecated
	@Test
	void testE() {
		assertTrue(true);
	}

	@Test
	void testB() {
		assertTrue(true);
	}
}
