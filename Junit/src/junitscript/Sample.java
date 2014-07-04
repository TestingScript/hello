package junitscript;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sample {

	@Test
	public void test() {
		System.out.println("test one check");
	}

	
	@Test
	public void testone() {
		String str="hello";
			assertEquals("hello", str);
			System.out.println("value displayed");
				
	}

}
