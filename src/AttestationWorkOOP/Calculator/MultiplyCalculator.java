package AttestationWorkOOP.Calculator;

public class MultiplyCalculator extends BasicCalculator {

    public MultiplyCalculator(Calculator calculator) {
        super(calculator);
    }

    /**
     * @param firstValue  Первое число для умножения.
     * @param secondValue Второе число для умножения.
     * @return Результат умножения {@code firstValue} на {@code secondValue}.
     */
    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue * secondValue;
    }
}
