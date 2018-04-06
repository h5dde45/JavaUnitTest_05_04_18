package com.p5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void substring() throws Exception {
        assertEquals("ert", "qwert".substring(2));
    }

    @Test
    public void charCount() throws Exception {
        assertEquals('d', "qwedf".charAt(3));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void substring_invalid() throws Exception {
        "".charAt(1);
    }

    @Test(timeout = 11111)
    public void oneSecond() throws Exception {
        Thread.sleep(2222);
    }

}
