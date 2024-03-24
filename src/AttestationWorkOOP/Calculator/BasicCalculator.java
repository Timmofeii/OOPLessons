package AttestationWorkOOP.Calculator;

import AttestationWorkOOP.Calculator.Calculator;

public class BasicCalculator implements Calculator {
    BasicCalculator calculator;
 String operator;

    public Double calculate(Double firstValue, Double secondValue) {
        switch (operator) {
            case ("+"):
               return new AddCalculator(calculator).calculate(firstValue,secondValue);


            case ("-"):
                return new SubtractCalculator(calculator).calculate(firstValue,secondValue);
            case ("*"):
                return new MultiplyCalculator(calculator).calculate(firstValue,secondValue);

            case ("/"):
                return new SplitCalculator(calculator).calculate(firstValue,secondValue);


        }
        return Double.NaN;
    }



}
