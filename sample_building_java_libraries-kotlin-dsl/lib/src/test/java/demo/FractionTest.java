package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {
    Fraction classUnderTest = new Fraction(1, 5);
    Integer intUnderTest = 2;
    Double doubleUnderTest = 10.9;

    @Test public void testSomeFunction(){
        assertTrue("FAILED: not valid object.", classUnderTest.someFunction(classUnderTest));
    }
    @Test public void testInteger(){
        assertTrue("FAILED: not valid Integer.", classUnderTest.someFunction(intUnderTest));
    }
    @Test public void testDoubleNotAllowed(){
        assertFalse("FAILED: should not be valid to have float point numbers here.", classUnderTest.someFunction(doubleUnderTest));
    }
    @Test public void testZeroOnDenominadorNotAllowed(){
        assertFalse("FAILED: not be valid to have denominador == 0'", classUnderTest.someFunction(new Fraction(1, 0)));
    }
}
