package com.howtodoinjava.junit5.examples.conditionalExecution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTests {
	@Test
	@EnabledOnOs(OS.MAC)
	void testOnMacOs() {
	    assertTrue(true);
	}

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void doNotTestOnWindows() {
		assertTrue(true);
	}
	
	@Test
	@DisabledOnJre(JRE.JAVA_8)
	void onlyOnJava8() {
		assertTrue(true);
	}

	@Test
	@EnabledOnJre({ JRE.JAVA_17, JRE.JAVA_18 })
	void onJava17Or18() {
		assertTrue(true);
	}
	
	@Test
	@DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
	void notFromJava8to11() {
		assertTrue(true);
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_12, max = JRE.JAVA_18)
	void fromJava12to18() {
		assertTrue(true);
	}
	
	@Test
	@EnabledIfSystemProperty(named = "any.system.property", matches = "value-regex*")
	public void onlyIfPropertyValueIsFound() {
		assertTrue(true);
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
	public void executeOnlyInDevEnvironment() {
		assertTrue(true);
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "ENV", matches = ".*prod.*")
	public void disabledOnProdEnvironment() {
		assertTrue(true);
	}
	
	@Test
	@EnabledIf("customConditionalFunction")
	void enabled() {
	    assertTrue(true);
	}

	@Test
	@DisabledIf("customConditionalFunction")
	void disabled() {
	    assertTrue(true);
	}

	boolean customConditionalFunction() {
	    return true;
	}
}
