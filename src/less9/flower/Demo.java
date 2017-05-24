package less9.flower;

import less8.flower.Flower;

import static less9.flower.Rose.getRoseCount;
import static less9.flower.Rose.roseSoldPrint;


public class Demo {
    public static void main(String[] args) {

        Flower[] roses = new Rose[101];
        for (int i = 0; i < roses.length; i++) {
            roses[i] = new Rose();
        }
        Flower booket2[] = new Flower[]{
                new Rose(),
                new Daisy(),
                new Daisy(),
                new Tulip(),
                new Carnations(),
        };
        Flower booket3[] = new Flower[]{
                new Rose(),
                new Rose(),
                new Rose(),
                new Daisy(),
                new Daisy(),
        };

      //  getCost(roses);

    }
}
