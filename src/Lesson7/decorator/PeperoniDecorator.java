package Lesson7.decorator;

public class PeperoniDecorator extends PizzaDecorator{
    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost()+30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" peperoni";
    }
}
