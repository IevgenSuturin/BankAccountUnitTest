package com.yevhensuturin;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.security.Policy;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ChallengeParameterTest {
    private String input;
    private String output;
    private ChallengeUtilities utilities;

    public ChallengeParameterTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup(){
        utilities = new ChallengeUtilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCondition(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void utilities_removePairs(){
        assertEquals(output, utilities.removePairs(input));
    }
}
