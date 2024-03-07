package Lesson7.decorator;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost()+20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" cheese";
    }
}
