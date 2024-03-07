package Lesson7.fabric;

public class GemGen implements ItemGen{
    @Override
    public IGameIterm createItem() {
        return new GemReward();
    }
}
