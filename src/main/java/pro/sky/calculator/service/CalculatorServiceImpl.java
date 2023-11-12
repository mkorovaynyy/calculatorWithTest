package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String toAddTwoNumbers(String  a, String  b) {
        try {
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            return "" + a + " + " + b + " = " + sum;
        }
       catch (NumberFormatException exception) {
            exception.printStackTrace();
            return "Неверный тип параметра - необходимо указать число";
       }
    }

    @Override
    public String toSubstractTwoNumbers(String  a, String b) {;
        try {
            int sub = Integer.parseInt(a) - Integer.parseInt(b);
            return "" + a + " - " + b + " = " + sub;
        }
        catch (NumberFormatException exception) {
            exception.printStackTrace();
            return "Неверный тип параметра - необходимо указать число";
        }
    }

    @Override
    public String toMultiplyTwoNumbers(String  a, String b) {
        try {
            int mult = Integer.parseInt(a) * Integer.parseInt(b);
            return  "" + a + " * " + b + " = " + mult;
        }
        catch (NumberFormatException exception) {
            exception.printStackTrace();
            return "Неверный тип параметра - необходимо указать число";
        }
    }

    @Override
    public String toDivideTwoNumbers(String  a, String b) {
        try {
            int div = Integer.parseInt(a) / Integer.parseInt(b);
            return  "" + a + " / " + b + " = " + div;
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
            throw new ArithmeticException("деление на 0");
        }
    }
}
