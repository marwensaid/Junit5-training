package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.*;

public class RepeatedInvocationsTest {
	
	@BeforeAll
	public static void init(){
		System.out.println("Before All init() method called");
	}
	
	@BeforeEach
	public void initEach(){
		System.out.println("Before Each initEach() method called");
	}

	@DisplayName("Add operation test")
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) 
	{
		System.out.println("Running addNumber test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	@AfterEach
	public void cleanUpEach(){
		System.out.println("After Each cleanUpEach() method called");
	}
	
	@AfterAll
	public static void cleanUp(){
		System.out.println("After All cleanUp() method called");
	}
}