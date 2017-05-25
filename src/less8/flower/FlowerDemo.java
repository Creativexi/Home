package less8.flower;
import less9.flower.Carnations;
import less9.flower.Daisy;
import less9.flower.Rose;
import less9.flower.Tulip;

import static less8.flower.Flower.flowerSold;
import static less8.flower.Flower.printBooketInfo;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower booket1[] = new Flower[]{
                new Rose(),
                new Rose(),
                new Rose(),
                new Rose(),
                new Rose(),
        };
        Flower booket2[] = new Flower[]{
                new Daisy(),
                new Daisy(),
                new Daisy(),
                new Rose(),
                new Rose(),
                new Rose(),
                new Carnations(),
        };
        Flower booket3[] = new Flower[]{
                new Tulip(),
                new Daisy(),
                new Rose(),
                new Carnations(),
                new Carnations(),
        };

        printBooketInfo(booket1);
        flowerSold();
    }
}


