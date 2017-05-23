package less8.flower;
import static less8.flower.Flower.flowerSold;
import static less8.flower.Flower.printBooketInfo;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower booket1[] = new Flower[]{
                new Flower("Rose", 20),
                new Flower("Lotus", 25),
                new Flower("Lily", 15),
                new Flower("Daisy", 10),
                new Flower("Aster", 22),
        };
        Flower booket2[] = new Flower[]{
                new Flower("Rose", 20),
                new Flower("Rose", 20),
                new Flower("Rose", 20),
                new Flower("Rose", 20),
                new Flower("Rose", 20),
        };
        Flower booket3[] = new Flower[]{
                new Flower("Lily", 15),
                new Flower("Lily", 15),
                new Flower("Lily", 15),
                new Flower("Aster", 22),
                new Flower("Aster", 22),
        };
        printBooketInfo(booket1);
        flowerSold();
    }
}


