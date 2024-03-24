package AttestationWorkOOP.Calculator;


import AttestationWorkOOP.Parser;

public class SimpleCalculator implements Calculator {
    private Parser parser;
    SimpleCalculator calculator;
    String operator;

    public Double allOperation(String stringOperation) {

        String[] arrOperation = parser.parsing(stringOperation);
        Double result = parser.isNumber(arrOperation[0]);
        for (int i = 1; i < arrOperation.length; i++) {
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


//    /**
//     *
//     * @param operation принимает строку, парсит её и проходит циклом по массиву с этой  строки,
//     *                 выполняя операции сложения, вычитания,
//     *                  умножения и деления
//     * @return Возвращает результат выполнения операций.
//     */
//    public Double calculate(String operation) {
//
//
//        String[] arrOperation = parser.parsing(operation);
//        Double result = parser.isNumber(arrOperation[0]);
//
//        for (int i = 1; i < arrOperation.length; i++) {
//            switch (arrOperation[i]) {
//                case ("+"):
//                    result = addNumber(result, arrOperation[i + 1]);
//                    i++;
//                    break;
//                case ("-"):
//                    result = subtractNumber(result, arrOperation[i + 1]);
//                    i++;
//                    break;
//                case ("*"):
//                    result = multiplyNumber(result, arrOperation[i + 1]);
//                    i++;
//                    break;
//                case ("/"):
//                    result = splitNumber(result, arrOperation[i + 1]);
//                    i++;
//                    break;
//
//
//            }
//        }
//
//        return result;
//    }

//    private Double addNumber(Double firstNumber, String secondNumber) {
//        return firstNumber + parser.isNumber(secondNumber);
//    }
//
//    private Double subtractNumber(Double firstNumber, String secondNumber) {
//        return firstNumber - parser.isNumber(secondNumber);
//    }
//
//
//    private Double multiplyNumber(Double firstNumber, String secondNumber) {
//        return firstNumber * parser.isNumber(secondNumber);
//    }
//
//    private Double splitNumber(Double firstNumber, String secondNumber) {
//        double result = 0;
//        try {
//            result = firstNumber*1.0 / parser.isNumber(secondNumber);
//        } catch (MatchException e) {
//            System.out.println(firstNumber+ " /"+ secondNumber+e);
//            return Double.NaN;
//        }
//
//        return result;
//    }


}

