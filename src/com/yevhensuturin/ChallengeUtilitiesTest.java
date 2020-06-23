package com.yevhensuturin;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeUtilitiesTest {
    private static ChallengeUtilities utilities;

    @BeforeClass
    public static void beforeClass(){
        utilities = new ChallengeUtilities();
    }

    @Test
    public void everyNthChar() {
        assertArrayEquals(new char[]{'e', 'l'}, utilities.everyNthChar("hello".toCharArray(), 2));
        assertArrayEquals(new char[]{'h','e','l','l','o'}, utilities.everyNthChar("hello".toCharArray(), 8));
    }

    @Test
    public void removePairs_first() {
        String input = "AABCDDEFF";
        assertEquals("ABCDEF", utilities.removePairs(input).intern());
    }

    @Test
    public void removePairs_second() {
        String input = "ABCCABDEEF";
        assertEquals("ABCABDEF", utilities.removePairs(input).intern());
        assertNull("Did not null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converterArithmeticException(){
        utilities.converter(10, 0);
        fail("Should have thrown an ArithmeticException");
    }

    @Test
    public void nullIfOddLength() {
        String even = "1111";
        assertNotNull(utilities.nullIfOddLength(even));
        String odd = "11111";
        assertNull(utilities.nullIfOddLength(odd));
    }
}