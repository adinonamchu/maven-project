package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *@parm name of person
  *@retunr greeting string
  */


  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
