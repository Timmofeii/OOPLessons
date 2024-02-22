package Lesson1;

import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    private List<HotDrink> hotDrinkList;

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public void printMenu() {
        System.out.println("__________MENU__________");
        for (HotDrink hotDrink : hotDrinkList) {
            System.out.println(hotDrink.toString());
        }
        System.out.println("________________________");
    }

    @Override
    public Product sellProduct(String name) {
        return null;
    }

    @Override
    public double getPrice(String name) {
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.equals(name)) {
                return hotDrink.getCost();
            }
        }

        return 0;
    }

    public Product getProduct(String name) {
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name)) {
                return hotDrink;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }


}
