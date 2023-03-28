package com.howtodoinjava.junit5.examples;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;

@SelectPackages("com.howtodoinjava.junit5.examples")
@IncludePackages("com.howtodoinjava.junit5.examples.packageC")
//TODO: exclure un tag pour l'exe
public class JUnit5TestSuite {

}
