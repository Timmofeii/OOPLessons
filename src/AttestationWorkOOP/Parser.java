package AttestationWorkOOP;


import java.util.ArrayList;
import java.util.List;

public class Parser {
    public String[] parsing(String operation) {

        String[] parsArr = operation.split(" ");
        if (checkCurrentSize(parsArr)) {

            checkCurrentData(parsArr);
        }

        return parsArr;
    }

    private boolean checkCurrentSize(String[] parsArr) {

        return parsArr.length >= 2 && parsArr.length % 2 != 0;
    }

    private String[] checkCurrentData(String[] parsArr) {
        List<String> notCorrectData = new ArrayList<>();
        for (int i = 0; i < parsArr.length; i++) {
            if (i % 2 == 0) {
                try {
                    Double.parseDouble(parsArr[i]);
                } catch (NumberFormatException e) {
                    notCorrectData.add("\"" + parsArr[i] + "\"");
                }

            } else {

                if (!isNotOperator(parsArr[i])) {
                    notCorrectData.add("\"" + parsArr[i] + "\"");
                }


            }


        }
        if (notCorrectData.size() > 0) {
            System.out.println("Некорректные данные " + notCorrectData);
        }

        return parsArr;
    }

    private boolean isNotOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public double isNumber(String value) {

        try {
            return Double.parseDouble(value);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
return Double.NaN;

    }
}
