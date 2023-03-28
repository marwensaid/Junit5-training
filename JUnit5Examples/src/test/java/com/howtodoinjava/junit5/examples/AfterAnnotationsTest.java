package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class AfterAnnotationsTest {

	@DisplayName("Add operation test")
	//TODO:  répéter le test 5 fois
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) 
	{
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		//TODO: faire un test de la class Calculator
	}
	
	@AfterAll
	public static void cleanUp(){
		System.out.println("After All cleanUp() method called");
	}
	
	@AfterEach
	public void cleanUpEach(){
		System.out.println("After Each cleanUpEach() method called");
	}

}
