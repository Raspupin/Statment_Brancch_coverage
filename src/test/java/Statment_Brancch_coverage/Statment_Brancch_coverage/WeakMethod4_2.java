package Statment_Brancch_coverage.Statment_Brancch_coverage;

//import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4_2 {


	@Test(expected = ArithmeticException.class) 
	public void testExposingErrorWithoutFullCover() {
		WeakClass.weakMethod3(5, 0);// will throw arithmetic error 
		
	}

}
