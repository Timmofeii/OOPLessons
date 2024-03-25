package AttestationWorkOOP.Service;


import java.util.ArrayList;
import java.util.List;

public class Parser {
    /**
     *
     * @param operation принимает строку с операциями и переводит в строковый массив
     * @return возвращает строковый массив с числами и операциями
     */
    public String[] parsing(String operation) {

        String[] parsArr = operation.split(" ");
        if (checkCurrentSize(parsArr)) {

            checkCurrentData(parsArr);
        }

        return parsArr;
    }

    /**
     *
     * @param parsArr проверяет корректную длину массива, меньше минимального, не может быть операций,
     *                длинна должна быть парной( к-ство нечтное) чтобы проверить что заканчивается числом
     * @return возращает истину или ложь проверяемых параметров
     */
    private boolean checkCurrentSize(String[] parsArr) {

        return parsArr.length >= 2 && parsArr.length % 2 != 0;
    }

    /**
     *
     * @param parsArr принимает массив String  и проходит по нему проверяя ли на корректность, выводит список со всеми
     *                некорректными данными в консоль, если они есьть
     * @return возращает массив строк
     */

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
            System.out.println(" Некорректные данные " + notCorrectData);
        }

        return parsArr;
    }

    /**
     *
     * @param s принимает строк и проверяет её на то ябляется ли она одним из обрабатуемых операторов
     * @return возразает True если оператор совпадает с одним из вариантов
     */
    private boolean isNotOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    /**
     *
     * @param value принимает строку и пробует ее перевести в тип Double
     * @return возвращает Double и бесконечность если не получилось перевести в Double
     */
    public double isNumber(String value) {

        try {
            return Double.parseDouble(value);
        }catch (NumberFormatException e){
            return Double.NaN;
        }


    }
}
