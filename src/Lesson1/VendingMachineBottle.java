package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottle implements VendingMachine {

    private List<BottleOfWater> bottleOfWaterList;

    public VendingMachineBottle() {
        List<BottleOfWater> bottlesLis = new ArrayList<>();
        this.bottleOfWaterList = bottlesLis;
    }


    public void setBottlesList(List<BottleOfWater> bottlesList) {

        this.bottleOfWaterList = bottlesList;
    }


    public List<BottleOfWater> getBottlesList() {
        return bottleOfWaterList;
    }

    public BottleOfWater sellProduct(String name) {
        for (BottleOfWater bottleOfWater : bottleOfWaterList) {
            if (name.equals(bottleOfWater)) {
                return bottleOfWater;
            }
        }
        return null;
    }

    @Override
    public double getPrice(String name ) {
        for (BottleOfWater bottleOfWater : bottleOfWaterList) {
            if(bottleOfWater.getName().equals(name)){
                return bottleOfWater.getCost();
            }
        }
        return 0;
    }




    public void addBottleOfWater(BottleOfWater bottle) {

        bottleOfWaterList.add(bottle);
    }
}
