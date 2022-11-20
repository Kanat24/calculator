package com.example.calculator;

import com.example.calculator.service.IllegalNumberException;
import com.example.calculator.service.ServiceCalculator;
import org.assertj.core.annotations.Beta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    ServiceCalculator serviceCalculator = new ServiceCalculator();
        private  int a;
        private  int b;
        private int c;
    @BeforeEach
    public void setUp() {
        a=5;
        b=5;
    }
    @Test
    public void calculatorPlus(){
        c=a+b;
        assertEquals(c, serviceCalculator.calculatorPlus(a,b));
    }
    @Test
    public void calculatorMinus(){
        c=a-b;
        assertEquals(c, serviceCalculator.calculatorMinus(a,b));
    }
    @Test
    public void calculatorMultiply(){
        c=a*b;
        assertEquals(c, serviceCalculator.calculatorMultiply(a,b));
    }
    @Test
    public void calculatorDivide(){
        c=a/b;
        assertEquals(c, serviceCalculator.calculatorDivide(a,b));
    }
    @Test
    public void calculatorDivideNotNull(){
      assertThrows(IllegalNumberException.class, ()->{serviceCalculator.calculatorDivide(10,0);
        });
    }
}
