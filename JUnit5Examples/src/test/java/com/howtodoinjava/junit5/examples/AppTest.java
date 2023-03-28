package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
 
public class AppTest {
	
	private AppTest(TestInfo testInfo) {
	    System.out.println("Working on test " + testInfo.getDisplayName());
	}
     
    //TODO: cette méthode doit s'exe avant tout les tests
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    //TODO: cette méthode doit s'exe avant chaque test
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    @Test
    void testCalAdd()
    {
        System.out.println("======testCalAdd EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }
    
    //@Tag("DEV")
    @Test
    void testCalSubtract()
    {
        System.out.println("======testCalSubtract EXECUTED=======");
        Assertions.assertEquals( 2 , Calculator.subtract(4, 2));
    }
    
    //@Tag("DEV")
    @Test
    void testCalMultiply()
    {
        System.out.println("======testCalMultiply EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.multiply(2, 2));
    }
     
    @Tag("PROD")
    //TODO: faire que ce test soit ignoré
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }
     
    //TODO: cette méthode doit s'exe après chaque test
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    //TODO: cette méthode doit s'exe après tout test
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
