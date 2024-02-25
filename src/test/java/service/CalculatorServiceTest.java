package service;

import com.calculator.calculatordemo.CalculatorService;
import com.calculator.calculatordemo.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void plusPositive() {
        int a = 10;
        int b = 5;

        int actual = calculatorService.calculatorSum(a, b);
        Assertions.assertEquals(15, actual);
    }

    @Test
    void plusNegative() {
        int a = -20;
        int b = -15;

        int actual = calculatorService.calculatorSum(a, b);
        Assertions.assertEquals(-35, actual);
    }

    @Test
    void minusPositive() {
        int a = 10;
        int b = 5;

        int actual = calculatorService.calculatorSubtraction(a, b);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void minusNegative() {
        int a = -15;
        int b = -20;

        int actual = calculatorService.calculatorSubtraction(a, b);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void multiplyPositive() {
        int a = 10;
        int b = 5;

        int actual = calculatorService.calculatorMultiply(a, b);
        Assertions.assertEquals(50, actual);
    }

    @Test
    void multiplyNegative() {
        int a = -10;
        int b = 3;

        int actual = calculatorService.calculatorMultiply(a, b);
        Assertions.assertEquals(-30, actual);
    }

    @Test
    void dividePositive() {
        int a = 10;
        int b = 5;

        int actual = calculatorService.calculatorDivide(a, b);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void divideNegative() {
        int a = -20;
        int b = 10;

        int actual = calculatorService.calculatorDivide(a, b);
        Assertions.assertEquals(-2, actual);
    }

    @Test
    void divisionByZero() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            calculatorService.calculatorDivide(10, 0);
        });
    }
}
