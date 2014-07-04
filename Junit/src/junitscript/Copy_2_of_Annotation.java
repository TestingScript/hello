package junitscript;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;




public class Copy_2_of_Annotation {
	
   //execute before class
   @BeforeClass
   public static void beforeClass() {
      System.out.println("in before class");
   }

   @BeforeClass
   public static void beforeClassone() {
      System.out.println("in before classone");
   }

   //execute after class
   @AfterClass
   public static void  afterClass() {
      System.out.println("in after class");
   }

   @AfterClass
   public static void  afterClassone() {
      System.out.println("in after classone");
   }

   //execute before test
   @Before
   public void before() {
      System.out.println("in before test");
   }
   
   @Before
   public void beforeone() {
      System.out.println("in before testone");
   }
   //execute after test
   @After
   public void after() {
      System.out.println("in after test");
   }
   
   @After
   public void afterone() {
      System.out.println("in after testone");
   }
	
   //test case
   @Test
   public void testone() {
      System.out.println("testone ");
   }
   @Test
   public void testtwo() {
      System.out.println("in testtwo");
   }
   @Test
   public void testthree() {
      System.out.println("in testtwo");
   }
   
   
   @Ignore
   @Test
   public void testfour() {
      System.out.println("in testfour");
   }
	
   //test case ignore and will not execute
   @Ignore
   public void ignoreTest() {
      System.out.println("in ignore test");
   }
   
 
}