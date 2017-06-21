package less9.flower;

import less8.flower.Flower;

public class Daisy extends Flower {
    public static int daisyCount;

    public Daisy() {
        daisyCount++;
    }

    @Override
    public int getCost() {
        return 16;
    }

    public static int getDaisyCount() {
        return daisyCount;
    }

    public static void printDaisySold() {
        System.out.println("количество проданных маргариток:" + getDaisyCount());
    }
}
