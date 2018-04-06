package com.p6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Test_Mockito {
    @Mock
    private NewCalculator newCalculator;

    // используем аанотацию @InjectMocks для создания mock объекта
    @InjectMocks
    NewCalculatorImpl calculator=new NewCalculatorImpl(newCalculator);

    @Test
    public void testCalcAdd() throws Exception {
        // определяем поведение калькулятора для операции сложения
        when(calculator.add(10.0, 20.0)).thenReturn(30.0);

        // проверяем действие сложения
        assertEquals(calculator.add(10, 20), 30.0, 0);
        // проверяем выполнение действия
        verify(newCalculator).add(10.0, 20.0);

        // определение поведения с использованием doReturn
        doReturn(15.0).when(newCalculator).add(10.0, 5.0);

        // проверяем действие сложения
        assertEquals(calculator.add(10.0, 5.0), 15.0, 0);
        verify(newCalculator).add(10.0, 5.0);

    }
}