package com.p1.jtu;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyMathTest {
//    @Rule
//    public TestRule timeout=new Timeout(100);

    int a;
    int b;
    int result;

    public MyMathTest(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection numbers(){
        return Arrays.asList(new Object[][]{{1,2,3},{4,5,9},{2,4,6}});
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test//(timeout = 111)
    public void add() throws Exception {
        assertEquals(result, MyMath.add(a, b));
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void div() throws Exception {
        assertEquals(4, MyMath.div(8, 0));
    }

}