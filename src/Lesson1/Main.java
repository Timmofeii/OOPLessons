package Lesson1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<HotDrink> hotDrinkList = new ArrayList<>(Arrays.asList(
                new HotDrink("Latte", 12, 250, 65),
                new HotDrink("Cappuccino", 13, 350, 65),
                new HotDrink("Doppio", 10, 60, 65),
                new HotDrink("ristretto", 6, 30, 65),
                new HotDrink("Maccoffee 3in1", 3, 300, 100)));

        HotDrinkMachine studentStolovka = new HotDrinkMachine();
        studentStolovka.setHotDrinkList(hotDrinkList);
        studentStolovka.printMenu();


        System.out.println(studentStolovka.getProduct("Latte"));
        System.out.println(studentStolovka.getProduct("Doppio", 60, 65));
        System.out.println(studentStolovka.getProduct("latte", 20, 60));

    }
}