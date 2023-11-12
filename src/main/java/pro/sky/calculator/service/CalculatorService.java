package pro.sky.calculator.service;

public interface CalculatorService {
    default String toGreet() {
        return "Добро пожаловать в калькулятор";
    }
    String toAddTwoNumbers(String  a, String b);
    String toSubstractTwoNumbers(String  a, String b);
    String toMultiplyTwoNumbers(String  a, String b);
    String toDivideTwoNumbers(String  a, String b);
}
