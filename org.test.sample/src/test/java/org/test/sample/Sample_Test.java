package org.test.sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_Test {
  @Test
  public void first() {
	  
	  Reporter.log("Welcome to TestNG",true);
	  System.out.println("changes made");
	  System.out.println("change done");
	  //added
  }
}
