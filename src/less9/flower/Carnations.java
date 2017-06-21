package less9.flower;

import less8.flower.Flower;

public class Carnations extends Flower {
    public static int carnationsCount;

    public Carnations() {
        carnationsCount++;
    }

    public static int getCarnationsCount() {
        return carnationsCount;
    }

    @Override
    public int getCost() {
        return 5;
    }

    public static void printCarnationsSold() {
        System.out.println("количество проданных гвоздик:" + getCarnationsCount());
    }
}
