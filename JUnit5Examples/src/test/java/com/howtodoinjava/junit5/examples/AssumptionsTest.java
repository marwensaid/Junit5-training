package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

  @Test
  void testOnDev() {
    //TODO: set un ENV (dev) et tester le get de cette property
  }

  @Test
  void testOnProd() {
    //TODO: set un ENV (prod) et tester le get de cette property
  }

  private static String message() {
    return "TEST Execution Failed :: ";
  }
}
