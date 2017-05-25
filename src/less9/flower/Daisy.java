package less9.flower;

import less8.flower.Flower;

public class Daisy extends Flower {
    private static int daisyCount;

    public Daisy() {
        super.setCost(15);
        daisyCount++;
        flowerCount++;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public static int getDaisyCount() {
        return daisyCount;
    }

    public static void printDaisySold() {
        System.out.println("количество проданных маргариток:" + getDaisyCount());
    }
}
