package AttestationWorkOOP;

import AttestationWorkOOP.Calculator.SimpleCalculator;
import AttestationWorkOOP.Service.Parser;
import AttestationWorkOOP.View.SimpleMenu;

public class Main {
    public static void main(String[] args) {

        Application app = new Application(new SimpleCalculator(new Parser()), new SimpleMenu());
        app.start();
    }

}
