package com.p4;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    private static Calc calc;

    @Rule
    public SimpleRule rule=new SimpleRule();

    @BeforeClass
    public static void init() {
        System.out.println("new object...");
        calc = new Calc();
    }

    @Before
    public void start() {
        System.out.println("start test");

    }

    @Test
    public void test1() {
        System.out.println("test1:");
       assertEquals(calc.sum(5,5),10);
    }

    @Test(expected = Exception.class)
    public void test2() {
        System.out.println("test2:");
        throw new  ArithmeticException();
    }

    @After
    public void testFinish(){
        System.out.println("finish test");
    }

    @AfterClass
    public static void freeRes() {
        System.out.println("free resources...");
    }

}