package less8.flower;
import less9.flower.Rose;

import static less8.flower.Flower.flowerSold;
import static less8.flower.Flower.printBooketInfo;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower booket1[] = new Flower[]{
                new Rose(),
                new Rose(),
        };

        printBooketInfo(booket1);
        flowerSold();
    }
}


