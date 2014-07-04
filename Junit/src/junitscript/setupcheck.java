package junitscript;

import junit.framework.TestCase;

public class setupcheck extends TestCase {
 int value1, value2;
   
   // assigning the values
   public void setUp(){
      value1=3;
      value2=3;
   }

   // test method to add two values
   public void testAdd(){
      double result= value1 + value2;
      assertTrue(result == 6);
      System.out.println("assert displayed");
   }
}