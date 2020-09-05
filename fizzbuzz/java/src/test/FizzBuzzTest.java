package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void OneReturns1() {
        var result = "";
        result = FizzBuzzer.FizzBuzz(1);
        assertEquals("1", result);
    }



}
