package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {
    @Test public void testSomeFunction(){
        Fraction classUnderTest = new Fraction(10, 0);

//      TODO: check which assert I need here
        assertNotEquals(0, classUnderTest.someFunction());
    }
}

