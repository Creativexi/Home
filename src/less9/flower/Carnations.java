package less9.flower;

import less8.flower.Flower;

public class Carnations extends Flower {
    private static int carnationsCount;

    public Carnations() {
        super.setCost(50);
        carnationsCount++;
        flowerCount++;
    }

    public static int getCarnationsCount() {
        return carnationsCount;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public static void printCarnationsSold() {
        System.out.println("количество проданных гвоздик:" + getCarnationsCount());
    }
}
