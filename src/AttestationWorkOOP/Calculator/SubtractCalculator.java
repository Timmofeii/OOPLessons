package AttestationWorkOOP.Calculator;

public class SubtractCalculator implements Calculator {

    public SubtractCalculator(Calculator calculator) {
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue - secondValue;
    }
}
