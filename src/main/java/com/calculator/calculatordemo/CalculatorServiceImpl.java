package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String answerWelcom() {
        return "<h1> Добро пожаловать в калькулятор!</h1>";
    }

    @Override

    public int calculatorSum(int num1, int num2) {

        return num1 + num2;
    }

    @Override

    public int calculatorSubtraction(int num1, int num2) {

        return num1 - num2;
    }

    @Override

    public int calculatorMultiply(int num1, int num2) {

        return num1 * num2;
    }

    @Override

    public int calculatorDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Ошибка: деление на ноль");
        }
        return num1 / num2;
    }
}





