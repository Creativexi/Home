package less9.flower;

import less8.flower.Flower;

import static less9.flower.Carnations.printCarnationsSold;
import static less9.flower.Daisy.printDaisySold;
import static less9.flower.Rose.rosePrice;
import static less9.flower.Rose.roseSoldPrint;
import static less9.flower.Tulip.printTulipSold;

public class Demo {
    public static void main(String[] args) {

        Flower roses[] = new Rose[101];
        for (int i = 0; i < roses.length; i++) {
            roses[i] = new Rose();
        }
        Flower booket1[] = {
                new Carnations(),
                new Rose(),
                new Daisy(),
                new Tulip(),
                new Tulip(),
        };
        Flower booket2[] = {
                new Carnations(),
                new Tulip(),
                new Daisy(),
                new Daisy(),
                new Daisy(),
        };

        roseSoldPrint();
        printCarnationsSold();
        printDaisySold();
        printTulipSold();
        rosePrice(roses);
    }
}
