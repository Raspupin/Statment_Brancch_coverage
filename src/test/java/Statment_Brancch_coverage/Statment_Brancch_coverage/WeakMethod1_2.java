package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod1_2 {

    // Test division with a > 10 and b != 0 (no division by zero error)
    @Test
    public void testDivisionWithoutError() {
        assertEquals(2, WeakClass.weakMethod1(20, 10));
        assertEquals(5, WeakClass.weakMethod1(5, 10));
    }
    
}
