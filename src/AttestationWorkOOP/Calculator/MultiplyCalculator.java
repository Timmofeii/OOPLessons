package AttestationWorkOOP.Calculator;

public class MultiplyCalculator extends BasicCalculator {

    public MultiplyCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue * secondValue;
    }
}
