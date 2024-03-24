package AttestationWorkOOP.Calculator;

public class MultiplyCalculator implements Calculator {
    private Calculator calculator;

    public MultiplyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue * secondValue;
    }
}
