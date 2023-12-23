package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String answerWelcom() {
        return "<h1> Добро пожаловать в калькулятор!</h1>";
    }

    public int calculatorSum(int num1, int num2) {

        return num1 + num2;
    }

    public int calculatorSubtraction(int num1, int num2) {

        return num1 - num2;
    }

    public int calculatorMultiply(int num1, int num2) {

        return num1 * num2;
    }

    public int calculatorDivide(int num1, int num2) {

        return num1 / num2;
    }
}


