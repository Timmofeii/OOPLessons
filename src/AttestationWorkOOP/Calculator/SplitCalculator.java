package AttestationWorkOOP.Calculator;

public class SplitCalculator extends BasicCalculator {

    public SplitCalculator(Calculator calculator) {
        super(calculator);
    }

    /**
     * @param firstValue  Первое число для делния.
     * @param secondValue Второе число для деления.
     * @return Результат деления {@code firstValue} на {@code secondValue}.
     */
    @Override
    public Double calculate(Double firstValue, Double secondValue) {
       if (secondValue==0){
           System.out.println("На ноль делить не можно!");
           return Double.NaN;
       }
            return firstValue / secondValue;
     

    }
}
