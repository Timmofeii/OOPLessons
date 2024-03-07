package Lesson7.decorator;

public class PizzaDough implements Pizza{
    @Override
    public double getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Тесто";
    }
}
