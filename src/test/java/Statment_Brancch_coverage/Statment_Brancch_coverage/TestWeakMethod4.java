package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod4 {
	@Test
	public void testAllBranchesWithoutExposingError() {
	    assertEquals(20/(5), WeakClass.weakMethod4(20,5)); 
	    assertEquals(6/(2), WeakClass.weakMethod4(6, 2)); 
	    assertEquals(10/(2), WeakClass.weakMethod4(10, 2)); 
	}
	@Test(expected = ArithmeticException.class) 
	public void testExposingErrorWithoutFullCover() {
		WeakClass.weakMethod3(5, 0);// will throw arithmetic error 
		
	}

}
