package calculator.service.Impl;

import calculator.model.Calculator;
import calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Double calculate(Calculator calculator){
        if (calculator.getAction().equals("Addition(+)")) {
            return addition(calculator.getX(),calculator.getY());
        }
        else if (calculator.getAction().equals("Subtraction(-)")) {
            return subtraction(calculator.getX(),calculator.getY());
        }
        else if (calculator.getAction().equals("Multiplication(X)")) {
            return multiplication(calculator.getX(),calculator.getY());
        }
        return division(calculator.getX(),calculator.getY());
    }

    @Override
    public Double addition (Double a, Double b) {
        return a+b;
    }

    @Override
    public Double subtraction (Double a, Double b) {
        return a-b;
    }

    @Override
    public Double multiplication (Double a, Double b) {
        return a*b;
    }

    @Override
    public Double division (Double a, Double b) {
        return a/b;
    }
}

