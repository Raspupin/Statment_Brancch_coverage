package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class WeakMethod2_2 {


	@Test
	public void coverAllBranchesWithNoError() {
		 assertEquals(1, WeakClass.weakMethod2(10, 10));
	     assertEquals(-3, WeakClass.weakMethod2(9, -3));
	     assertEquals(2, WeakClass.weakMethod2(11, 5));
	     assertEquals(11/6, WeakClass.weakMethod2(11, 6));
	     assertEquals(9/5, WeakClass.weakMethod2(9, 5));
	}


}
