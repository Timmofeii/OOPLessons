package Lesson7.fabric;

public class GoldGen implements ItemGen{
    @Override
    public IGameIterm createItem() {
        return new GoldReward();
    }
}
