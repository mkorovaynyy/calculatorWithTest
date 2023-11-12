package pro.sky.calculator.serviceTest;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import pro.sky.calculator.service.CalculatorServiceImpl;

public class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    String num1 = "10";
    String num2 = "20";
    String num3 = "30";
    String num4 = "0";


    @Test
    public void shouldReturnGreeting() {
        Assertions.assertEquals("Добро пожаловать в калькулятор", calculatorService.toGreet());
    }
    @Test
    public void shouldReturnSumOfTwoNumbers() {
        Assertions.assertEquals("10 + 20 = 30", calculatorService.toAddTwoNumbers(num1, num2));
        Assertions.assertEquals("10 + 30 = 40", calculatorService.toAddTwoNumbers(num1, num3));
    }
    @Test
    public  void shouldReturnDifferenceOfTwoNumbers() {
        Assertions.assertEquals("10 - 20 = -10", calculatorService.toSubstractTwoNumbers(num1, num2));
        Assertions.assertEquals("10 - 30 = -20", calculatorService.toSubstractTwoNumbers(num1, num3));
    }

    @Test
    public void shouldReturnProductOfTwoNumbers() {
        Assertions.assertEquals("10 * 20 = 200", calculatorService.toMultiplyTwoNumbers(num1, num2));
        Assertions.assertEquals("10 * 30 = 300", calculatorService.toMultiplyTwoNumbers(num1, num3));
    }

    @Test
    public void  shouldReturnDivideOfTwoNumbers() {
        Assertions.assertEquals("10 / 20 = 0", calculatorService.toDivideTwoNumbers(num1, num2));
        Assertions.assertEquals("30 / 10 = 3", calculatorService.toDivideTwoNumbers(num3, num1));
    }
    @Test
    public void shouldReturnExpectedException() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        calculatorService.toDivideTwoNumbers(num1, num4);
                    }
                });
        Assertions.assertEquals("деление на 0", exception.getMessage());
    }
}
