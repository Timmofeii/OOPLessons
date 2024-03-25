package AttestationWorkOOP.Calculator;

public class SubtractCalculator extends BasicCalculator {


    public SubtractCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue - secondValue;
    }
}
