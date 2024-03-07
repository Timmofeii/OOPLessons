package Lesson7.fabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainFabric {
    public static void main(String[] args) {
        List<IGameIterm>gens= new ArrayList<>();
        gens.add(new GoldReward());
        gens.add(new GemReward());
        Random random= ThreadLocalRandom.current();
        for (int i = 0; i <10 ; i++) {
            IGameIterm item= gens.get(Math.abs(random.nextInt()%gens.size()));
            item.open();
        }
    }
}
