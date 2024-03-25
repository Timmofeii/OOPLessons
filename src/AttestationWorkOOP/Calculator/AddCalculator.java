package AttestationWorkOOP.Calculator;

public class AddCalculator extends BasicCalculator {


    public AddCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue + secondValue;
    }
}
