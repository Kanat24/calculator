package com.example.calculator.controller;

import com.example.calculator.service.ServiceCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class ControllerCalculator {
    private final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping("/")
    public String welcome() {
        return serviceCalculator.welcomeService();
    }

    @GetMapping("/plus")
    public String calculatorPlus(int num1, int num2) {
        String plus = String.format("%d + %d = %d", num1, num2, num1+num2);
        return plus;
    }

    @GetMapping("/minus")
    public String calculatorMinus(int num1, int num2) {
        String minus = String.format("%d - %d = %d", num1, num2, num1 - num2);
        return minus;
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(int num1, int num2) {
        String multiply = String.format("%d * %d = %d", num1, num2, num1 * num2);
        return multiply;
    }

    @GetMapping("/divide")
    public String calculatorDivide(int num1, int num2) {
        String divide = String.format("%d / %d = %d", num1, num2, num1 / num2);
        return divide;
    }
}
