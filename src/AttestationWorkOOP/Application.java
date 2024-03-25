package AttestationWorkOOP;

import AttestationWorkOOP.Calculator.SimpleCalculator;
import AttestationWorkOOP.Test.Test;
import AttestationWorkOOP.View.SimpleMenu;

import java.util.Scanner;

public class Application {
    private SimpleCalculator calculator;
    private SimpleMenu menu;
    private Test test = new Test();

    public Application(SimpleCalculator calculator, SimpleMenu menu) {
        this.calculator = calculator;
        this.menu = menu;
    }

    private Scanner sc = new Scanner(System.in);

    public void start() {

        String operation;
        while (true) {
            menu.printMenu();
            startTest(test);
            operation = sc.nextLine();
            exitCommand(operation);
            System.out.print(operation);
            menu.printResult(calculator.allOperation(operation));


        }


    }

    public void startTest(Test test) {
        for (int i = 0; i < test.getArrTest().length; i++) {
            String operation = test.getArrTest()[i];
            exitCommand(operation);
            System.out.print(operation);
            menu.printResult(calculator.allOperation(operation));
        }

    }

    private void exitCommand(String command) {
        if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("стоп")) {
            System.out.println("Выход из программы.");
            sc.close();
            System.exit(0);
        }
    }
}
