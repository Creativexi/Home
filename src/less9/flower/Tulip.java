package less9.flower;

import less8.flower.Flower;

public class Tulip extends Flower {
    private static int tulipCount;

    public Tulip() {
        super.setCost(33);
        tulipCount++;
        flowerCount++;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public static int getTulipCount() {
        return tulipCount;
    }

    public static void printTulipSold() {
        System.out.println("количество проданных тюльпанов:" + getTulipCount());
    }
}
