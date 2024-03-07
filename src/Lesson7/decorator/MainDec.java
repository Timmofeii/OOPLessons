package Lesson7.decorator;

public class MainDec {
    public static void main(String[] args) {
        Pizza pizza= new CheeseDecorator(new CheeseDecorator(new PeperoniDecorator(new PizzaDough())));

    }
    static void printPizza(Pizza pizza){
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
