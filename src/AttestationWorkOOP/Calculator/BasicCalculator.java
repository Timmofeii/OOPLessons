package AttestationWorkOOP.Calculator;

import AttestationWorkOOP.Calculator.Calculator;

public abstract class BasicCalculator implements Calculator {
    protected Calculator calculator;


    public BasicCalculator(Calculator calculator) {
        this.calculator = calculator;

    }


    public abstract Double calculate(Double firstValue, Double secondValue);

}
