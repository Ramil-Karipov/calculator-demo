package service;

import com.calculator.calculatordemo.CalculatorService;
import com.calculator.calculatordemo.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ParametrizedCalculatorServiceImplTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 3),
                Arguments.of(7, 5),
                Arguments.of(25, -13),
                Arguments.of(-103, -673));
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int a, int b) {
        int expected = a + b;
        Assertions.assertEquals(expected, calculatorService.calculatorSum(a, b));
    }

    void minus(int a, int b) {
        int expected = a - b;
        Assertions.assertEquals(expected, calculatorService.calculatorSubtraction(a, b));
    }

    void divide(int a, int b) {
        int expected = a / b;
        Assertions.assertEquals(expected, calculatorService.calculatorDivide(a, b));
    }

    void multiply(int a, int b) {
        int expected = a * b;
        Assertions.assertEquals(expected, calculatorService.calculatorMultiply(a, b));
    }
}
