package AttestationWorkOOP.Calculator;


import AttestationWorkOOP.Service.Parser;

public class SimpleCalculator implements Calculator {
    private Parser parser;
    private SimpleCalculator calculator;

    public SimpleCalculator(Parser parser) {
        this.parser = parser;
        this.calculator = this;
    }

    String operator;

    /**
     *
     * @param stringOperation принимает строку, парсит её:  проходит циклом по массиву с этой  строки,
     *                 выполняя операции сложения, вычитания,
     *                  умножения и деления
     * @return Возвращает результат выполнения операций.
     */
    public Double allOperation(String stringOperation) {

        String[] arrOperation = parser.parsing(stringOperation);
        Double result = parser.isNumber(arrOperation[0]);
        for (int i = 1; i < arrOperation.length - 1; i++) {
            operator = arrOperation[i];
            result = calculate(result, parser.isNumber(arrOperation[i + 1]));
            i++;
        }
        return result;
    }

    public Double calculate(Double firstValue, Double secondValue) {
        switch (operator) {
            case ("+"):

                return new AddCalculator(calculator).calculate(firstValue, secondValue);


            case ("-"):
                return new SubtractCalculator(calculator).calculate(firstValue, secondValue);
            case ("*"):
                return new MultiplyCalculator(calculator).calculate(firstValue, secondValue);

            case ("/"):
                return new SplitCalculator(calculator).calculate(firstValue, secondValue);


        }
        return Double.NaN;
    }





}

