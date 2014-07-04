package junitscript;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class Assert {

	@Test
	   public void testAdd() {
	      //test data
	      int num= 5;
	 
	      String str= "Junit is working fine";
	      String str1="null";

	      //check for equality
	      assertEquals("Junit is working fine", str);
	      
	      //check for false condition
	      assertFalse( 5> 6);

	      //check for not null value
	      assertNotNull(str1);
	   }
	
}
