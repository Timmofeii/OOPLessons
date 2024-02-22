package Lesson2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Market atb = new Market();
        Human human = new Human("Nikola");
        Human human2 = new Human("Stepan");
        atb.acceptToMarket(human2);
        atb.acceptToMarket(human);
        atb.update();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {


            menu.printMenu();
            int choice = sc.nextInt();
            String name;
            switch (choice) {
                case (1):
                    System.out.println("Введите имя человека");
                    name = sc.next();
                    atb.acceptToMarket(new Human(name));
                    break;
                case (2):
                    atb.printList();
                    System.out.println("Введите имя человека кто пойдет в очередь");
                    name = sc.next();
                    atb.goingQueue(name);
                    break;
                case(3):
                    atb.update();
                    break;
                case (4):
                    atb.printList();
                    System.out.println("Введите имя человека кто выйдет с магазина");
                    name = sc.next();
                    atb.goOut(name);
                case (5):
                    System.out.println("Спасибо за покупки");
                    return;
            }
            } catch (Exception e) {
                System.out.println(e);
                break;

            }

        }
    }


}