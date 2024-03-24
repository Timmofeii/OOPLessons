package AttestationWorkOOP;


import AttestationWorkOOP.Calculator.Calculator;

import java.util.Scanner;

public class Application {
    private Calculator calculator;
    private Menu menu;

    /**
     *
     * @param calculator принимаем наследника Calculator
     * @param menu принимаем наследника Menu
     */
    public <T extends Calculator>Application(T calculator, Menu menu) {
        this.calculator = calculator;
        this.menu = menu;
    }



    public void start() {
        Scanner sc = new Scanner(System.in);
        String operation;
        while (true) {
            menu.printMenu();
            operation = sc.nextLine();
            if (operation.equalsIgnoreCase("exit") || operation.equalsIgnoreCase("стоп")) {
                System.out.println("Выход из программы.");
                break;
            }
            System.out.println(operation);
            System.out.println(calculator.allOperation(operation));



        }
        sc.close();

    }
}
