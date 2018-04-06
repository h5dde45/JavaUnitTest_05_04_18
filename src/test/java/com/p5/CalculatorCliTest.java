package com.p5;

import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.mockito.Mockito.*;

public class CalculatorCliTest {
    private Calculator calculatorMock;
    private CalculatorCli calculatorCli;

    @Before
    public void setUp() throws Exception {
        calculatorMock = mock(Calculator.class);
        calculatorCli = new CalculatorCli(calculatorMock);
    }

    @Test
    public void emptyExpressionsMustBeSkipped() {
        calculatorCli.runInteractiveSession(new StringReader(";\n;   ;;;\t\n;"));
        verifyNoMoreInteractions(calculatorMock);
    }

    @Test
    public void emptyExpressionsSepar() {
        calculatorCli.runInteractiveSession(new StringReader("1;2;3"));

        verify(calculatorMock).calculate("1");
        verify(calculatorMock).calculate("2");
        verify(calculatorMock).calculate("3");
        verifyNoMoreInteractions(calculatorMock);
    }

    @Test
    public void emptyExpressionsSepar2() {
        when(calculatorMock.calculate("1")).thenReturn(1d);
        when(calculatorMock.calculate("2")).thenReturn(2d);
        when(calculatorMock.calculate("3")).thenReturn(3d);

        calculatorCli.runInteractiveSession(new StringReader("1;2;3"));

        verify(calculatorMock).calculate("1");
        verify(calculatorMock).calculate("2");
        verify(calculatorMock).calculate("3");
        verifyNoMoreInteractions(calculatorMock);
    }

}