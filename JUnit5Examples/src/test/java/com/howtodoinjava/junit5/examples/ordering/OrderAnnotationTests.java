package com.howtodoinjava.junit5.examples.ordering;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO: lancer en précisant un ordre
public class OrderAnnotationTests {
	@Order(5)
	@Test
	void testE() {
		assertTrue(true);
	}

	@Order(4)
	@Test
	void testA() {
		assertTrue(true);
	}

	@Order(3)
	@Test
	void testD() {
		assertTrue(true);
	}

	@Order(2)
	@Test
	void testC() {
		assertTrue(true);
	}

	@Order(1)
	@Test
	void testB() {
		assertTrue(true);
	}
}
