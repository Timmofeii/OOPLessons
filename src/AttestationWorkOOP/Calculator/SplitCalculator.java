package AttestationWorkOOP.Calculator;

public class SplitCalculator implements Calculator {
    private Calculator calculator;

    public SplitCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        try {
            return firstValue / secondValue;
        } catch (MatchException e) {
            System.out.println(e);
            return Double.NaN;
        }
    }
}
