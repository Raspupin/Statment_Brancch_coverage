package Statment_Brancch_coverage.Statment_Brancch_coverage;
//import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class WeakMethod2_1 {

	 // Test to expose division by zero error
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero2() {
        WeakClass.weakMethod2(9, 0); // This should throw ArithmeticException
    }



}
