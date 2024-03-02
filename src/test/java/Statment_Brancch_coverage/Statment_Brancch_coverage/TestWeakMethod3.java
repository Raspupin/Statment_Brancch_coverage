package Statment_Brancch_coverage.Statment_Brancch_coverage;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestWeakMethod3 {
	@Test
	public void testWithoutExposingError() {
	    assertEquals(10/(1), WeakClass.weakMethod3(10, 1)); 
	}
	@Test(expected = ArithmeticException.class) 
	public void testExposingErrorAllBranchesCovered() {
		assertEquals(10/(1), WeakClass.weakMethod3(10, 1)); 
		assertEquals(4/(1), WeakClass.weakMethod3(4, 1)); 
		WeakClass.weakMethod3(5, 0);// will throw arithmetic error 
	}
	
}
