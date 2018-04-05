package com.p2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class CalculateTest {
    @Test
    public void whenDivFirstOnSecondThenResultIs5() {
        final Calculate calculate = new Calculate();
        final int result = calculate.div(15, 5);
        assertThat(result, is(3));
    }

    @Test(expected = ArithmeticException.class)
    public void whenDivOnZeroExpectedArithmeticException() {
        final Calculate calculate = new Calculate();
        calculate.div(1, 0);
    }

    @Test
    public void whenDivThenResultNotNull() {
        final Calculate calculate = new Calculate();
        assertNotNull(calculate.div(15, 3));
    }

}