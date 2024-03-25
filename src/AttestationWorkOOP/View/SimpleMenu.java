package AttestationWorkOOP.View;

public class SimpleMenu implements Menu {
    @Override
    public void printMenu() {
        System.out.println("Для рассчета введите строку в формате: 'число' 'нужная операция' 'число', через пробел и  без прочих символов");
        System.out.println("Пример: '2.1 + 3.2', '5.5 * 4', '10.2 - 7', '8 / 2'");
        System.out.println("Для того чтобы прекратить выполнение программы введите 'exit' или 'стоп'.\n");

    }

    public void printResult(Double result) {
        System.out.println(" = " + result);
    }


}
