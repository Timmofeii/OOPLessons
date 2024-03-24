package AttestationWorkOOP.Calculator;

public class AddCalculator implements Calculator {
    private Calculator calculator;

    public AddCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue + secondValue;
    }
}
