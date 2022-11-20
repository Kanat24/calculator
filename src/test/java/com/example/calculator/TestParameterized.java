package com.example.calculator;

import com.example.calculator.service.ServiceCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParameterized {
    ServiceCalculator serviceCalculator = new ServiceCalculator();

    @ParameterizedTest
    @MethodSource("calculatorPlusSuites")
    public void calculatorPlus(int a, int b, int c) {
        assertEquals(c, serviceCalculator.calculatorPlus(a, b));
    }
    @ParameterizedTest
    @MethodSource("calculatorMinusSuites")
    public void calculatorMinus(int a, int b, int c) {
        assertEquals(c, serviceCalculator.calculatorMinus(a, b));
    }
    @ParameterizedTest
    @MethodSource("calculatorMultiplySuites")
    public void calculatorMultiply(int a, int b, int c) {
        assertEquals(c, serviceCalculator.calculatorMultiply(a, b));
    }
    @ParameterizedTest
    @MethodSource("calculatorDivideSuites")
    public void calculatorDivide(int a, int b, int c) {
        assertEquals(c, serviceCalculator.calculatorDivide(a, b));
    }

    public static List<Arguments> calculatorPlusSuites() {
        return List.of(
                Arguments.of(1, 2, 3),
                Arguments.of(10, 2, 12),
                Arguments.of(30, 22, 52));
    }
    public static List<Arguments> calculatorMinusSuites() {
        return List.of(
                Arguments.of(3, 2, 1),
                Arguments.of(10, 2, 8),
                Arguments.of(30, 22, 8));
    }
    public static List<Arguments> calculatorMultiplySuites() {
        return List.of(
                Arguments.of(1, 2, 2),
                Arguments.of(10, 2, 20),
                Arguments.of(30, 20, 600));
    }
    public static List<Arguments> calculatorDivideSuites() {
        return List.of(
                Arguments.of(2, 1, 2),
                Arguments.of(10, 2, 5),
                Arguments.of(30, 10, 3));
    }
}
