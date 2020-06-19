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
        fail("This test was not implemented!");
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
    }

    @Test
    public void converter() {
        fail("This test was not implemented!");
    }

    @Test
    public void nullIfOddLength() {
        fail("This test was not implemented!");
    }
}