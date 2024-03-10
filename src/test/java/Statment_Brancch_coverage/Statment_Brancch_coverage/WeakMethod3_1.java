package Statment_Brancch_coverage.Statment_Brancch_coverage;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod3_1 {
	@Test
	public void testWithoutExposingError() {
	    assertEquals(10/(1), WeakClass.weakMethod3(10, 1)); 
	}
	
}
