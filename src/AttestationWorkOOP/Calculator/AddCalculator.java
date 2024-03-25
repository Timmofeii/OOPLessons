package AttestationWorkOOP.Calculator;

public class AddCalculator extends BasicCalculator {


    public AddCalculator(Calculator calculator) {
        super(calculator);
    }

    /**
     *
     * @param firstValue Первое число для сложения
     * @param secondValue Втрое число для сложения
     * @return @return Результат сложения  {@code firstValue} на {@code secondValue}.
     */
    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue + secondValue;
    }
}
