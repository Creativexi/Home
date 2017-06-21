package less9.flower;

import less8.flower.Flower;

public class Tulip extends Flower {
    public static int tulipCount;

    public Tulip() {
        tulipCount++;
    }

    @Override
    public int getCost() {
        return 20;
    }

    public static int getTulipCount() {
        return tulipCount;
    }

    public static void printTulipSold() {
        System.out.println("количество проданных тюльпанов:" + getTulipCount());
    }
}
