package less8.flower;

import static less8.flower.Flower.getBouquet;

public class FlowerDemo {
    public static void main(String[] args) {

        Flower flowers[] = new Flower[]{
            new Flower("Rose", 20),
            new Flower("Lotus", 25),
            new Flower("Lily", 15),
            new Flower("Daisy", 10),
            new Flower("Aster", 22),
        };

        Booket booket1 = getBouquet(flowers);
        }

}
