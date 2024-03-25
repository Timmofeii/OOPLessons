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
     * Принимает строку, парсит её, проходит циклом по массиву с этой строкой,
     * выполняя операции сложения, вычитания и деления.
     *
     * @param stringOperation Строка с операциями и операндами.
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

    /**
     * Метод принимает два числа и в зависимости от оператора вызывает соответствующий метод
     * конкретного калькулятора для выполнения операции.
     * @param firstValue Первое число для операции
     * @param secondValue Второе число для операции
     * @return Результат выполнения операции.
     */
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

