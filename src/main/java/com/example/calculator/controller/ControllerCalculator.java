package com.example.calculator.controller;

import com.example.calculator.service.ServiceCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String calculatorPlus(int num1,int num2){
        int result = serviceCalculator.calculatorPlus(num1,num2);
        return String.format("%d + %d = %d", num1, num2, result);    }

    @GetMapping("/minus")
    public String calculatorMinus(int num1,int num2) {
        int result = serviceCalculator.calculatorMinus(num1,num2);
        return String.format("%d - %d = %d", num1, num2, result);    }

    @GetMapping("/multiply")
    public String calculatorMultiply(int num1,int num2) {
        int result = serviceCalculator.calculatorMultiply(num1,num2);
        return String.format("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    public String calculatorDivide(int num1,int num2) {
        int result = serviceCalculator.calculatorDivide(num1,num2);
        return String.format("%d / %d = %d", num1, num2, result);
    }
}
