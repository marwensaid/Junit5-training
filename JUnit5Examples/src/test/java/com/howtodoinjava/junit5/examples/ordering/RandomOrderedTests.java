package com.howtodoinjava.junit5.examples.ordering;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.Random.class)
public class RandomOrderedTests {
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
