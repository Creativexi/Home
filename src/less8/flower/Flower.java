package less8.flower;

import static less9.flower.Carnations.carnationsCount;
import static less9.flower.Daisy.daisyCount;
import static less9.flower.Rose.roseCount;
import static less9.flower.Tulip.tulipCount;

public abstract class Flower {
    private String name;
    public static int flowerCount;

    public Flower() {
        flowerCount++;
    }

    public String getName() {
        return name;
    }

    public abstract int getCost();

    public void setName(String name) {
        this.name = name;
    }

    public static void printBooketInfo(Flower[] booket) {
        int price = 0;
        for (Flower flower : booket) {
            price += flower.getCost();
        }
        System.out.println("Букет состоит из:");
        System.out.println("Роз: " + roseCount + " шт");
        System.out.println("Тюльпанов: " + tulipCount + " шт");
        System.out.println("Гвоздик: " + carnationsCount + " шт");
        System.out.println("Маргариток: " + daisyCount + " шт");
        System.out.println("Стоимость букета: " + price);
    }

    public static void flowerSold() {
        System.out.println("Всего цветков было продано: " + flowerCount + " шт");
    }
}
