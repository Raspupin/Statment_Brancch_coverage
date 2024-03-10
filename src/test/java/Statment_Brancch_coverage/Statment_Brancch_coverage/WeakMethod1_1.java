package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
//import static org.junit.Assert.*;

public class WeakMethod1_1 {

	 // Test to expose division by zero error
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass.weakMethod1(11, 0); // This should throw ArithmeticException
    }

    
}
