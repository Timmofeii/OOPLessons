package Lesson1;

public  class BottleOfWater extends Product{
    private  int volume;




    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public BottleOfWater(String name, int cost ,int volume) {
        super(name, cost);
        this.volume=volume;

    }


}
