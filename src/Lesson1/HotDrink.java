package Lesson1;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public HotDrink(String name, int cost, int volume, int temperature) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getCost() + "-Usdt " + this.getVolume() + "ml " + this.getTemperature() + " C°";
    }


}
