package pro.sky.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorServiceImpl;

import javax.validation.constraints.NotNull;
@Validated
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String toGreet() {
        return calculatorService.toGreet();
    }
    @GetMapping("/plus")
    public String toAddTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        return calculatorService.toAddTwoNumbers(userNum1, userNum2);
    }
    @GetMapping("/minus")
    public String toSubstractTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        return calculatorService.toSubstractTwoNumbers(userNum1, userNum2);
    }
    @GetMapping("/multiply")
    public String toMultiplyTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        return calculatorService.toMultiplyTwoNumbers(userNum1, userNum2);
    }
    @GetMapping("/divide")
    public String toDivideTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        return calculatorService.toDivideTwoNumbers(userNum1, userNum2);
    }

}
