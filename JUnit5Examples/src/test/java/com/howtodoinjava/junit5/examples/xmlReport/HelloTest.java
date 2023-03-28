package com.howtodoinjava.junit5.examples.xmlReport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {
  @Test
  void testOne(){
    Assertions.assertTrue(true);
  }

  //TODO: créer un 2éme test qui sera toujours RED (qui passe jamais)

}
