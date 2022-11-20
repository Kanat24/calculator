package com.example.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServiceCalculator {
    public String welcomeService(){
        String hello = "Добро пожаловать в калькулятор";
        return hello ;
    }
    public int calculatorPlus(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1+num2;
    }
    public int calculatorMinus(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1-num2;
    }
    public int calculatorMultiply(@RequestParam("num1") int num1,@RequestParam("num2") int num2){

        return num1*num2;
    }
    public int calculatorDivide(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        if (num2==0){
            throw new IllegalNumberException("Деление на 0 запрещено");
        }
        return num1/num2;
    }
}
