package AttestationWorkOOP.Calculator;

public class SubtractCalculator extends BasicCalculator {


    public SubtractCalculator(Calculator calculator) {
        super(calculator);
    }
    /**
     * @param firstValue  Первое число для Уменьшаемое.
     * @param secondValue Второе число для вычетаемое.
     * @return Разность {@code firstValue} на {@code secondValue}.
     */
    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue - secondValue;
    }
}
