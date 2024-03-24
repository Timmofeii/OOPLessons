package AttestationWorkOOP;

import AttestationWorkOOP.Calculator.Calculator;
import AttestationWorkOOP.Calculator.SimpleCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator= new SimpleCalculator();
    Application app= new Application(calculator, new SimpleMenu());
    app.start();
    }

}
