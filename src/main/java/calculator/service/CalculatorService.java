package calculator.service;

import calculator.model.Calculator;

public interface CalculatorService {
    Double calculate(Calculator calculator);
    Double addition(Double a, Double b);
    Double subtraction(Double a, Double b);
    Double multiplication(Double a, Double b);
    Double division(Double a, Double b);
}

